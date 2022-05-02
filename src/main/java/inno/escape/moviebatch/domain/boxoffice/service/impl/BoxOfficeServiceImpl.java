package inno.escape.moviebatch.domain.boxoffice.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import inno.escape.moviebatch.domain.boxoffice.dto.BoxOfficeResult;
import inno.escape.moviebatch.domain.boxoffice.dto.daily.DailyBoxOfficeRequestDto;
import inno.escape.moviebatch.domain.boxoffice.dto.daily.DailyBoxOfficeResponseDto;
import inno.escape.moviebatch.domain.boxoffice.dto.daily.DailyBoxOfficeResult;
import inno.escape.moviebatch.domain.boxoffice.dto.weekly.WeeklyBoxOfficeRequestDto;
import inno.escape.moviebatch.domain.boxoffice.dto.weekly.WeeklyBoxOfficeResponseDto;
import inno.escape.moviebatch.domain.boxoffice.entity.BoxOffice;
import inno.escape.moviebatch.domain.boxoffice.mapper.BoxOfficeMapper;
import inno.escape.moviebatch.domain.boxoffice.repository.BoxOfficeRepository;
import inno.escape.moviebatch.domain.boxoffice.service.BoxOfficeService;
import inno.escape.moviebatch.domain.movie.entity.Movie;
import inno.escape.moviebatch.domain.movie.repository.MovieRepository;
import inno.escape.moviebatch.global.Constants.URL_PATH;
import inno.escape.moviebatch.global.util.MultiValueMapUtil;
import inno.escape.moviebatch.global.util.WebClientUtil;
import java.util.List;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class BoxOfficeServiceImpl implements BoxOfficeService {

  private final ObjectMapper objectMapper;
  private final BoxOfficeRepository boxOfficeRepository;
  private final MovieRepository movieRepository;

  @Override
  public Mono<DailyBoxOfficeResponseDto> getDailyBoxOffice(DailyBoxOfficeRequestDto dto) {
    MultiValueMap<String, String> dailyValueMap = MultiValueMapUtil.convert(objectMapper, dto);

    Mono<DailyBoxOfficeResponseDto> dailyBoxOfficeResponseDtoMono = WebClientUtil.getResponseSpec(
        URL_PATH.DAILY.getValue(), dailyValueMap).bodyToMono(DailyBoxOfficeResponseDto.class);

    DailyBoxOfficeResult dailyBoxOfficeResult = Objects.requireNonNull(
        dailyBoxOfficeResponseDtoMono.block()).getBoxOfficeResult();

    String showRange = dailyBoxOfficeResult.getShowRange().split("~")[0];
    List<BoxOfficeResult> ds = dailyBoxOfficeResult.getDailyBoxOfficeList();

    List<BoxOffice> es = BoxOfficeMapper.INSTANCE.toEntityList(ds);
    for (int i = 0; i < es.size(); i++) {
      Movie movie = movieRepository.findByCode(ds.get(i).getMovieCd());

      es.get(i).setMovie(movie);
      es.get(i).setRankedDate(showRange);
    }
    boxOfficeRepository.saveAll(es);

    return dailyBoxOfficeResponseDtoMono;
  }

  @Override
  public Mono<WeeklyBoxOfficeResponseDto> getWeeklyBoxOffice(WeeklyBoxOfficeRequestDto dto) {
    MultiValueMap<String, String> weeklyValueMap = MultiValueMapUtil.convert(objectMapper, dto);

    return WebClientUtil.getResponseSpec(URL_PATH.WEEKLY.getValue(), weeklyValueMap)
        .bodyToMono(WeeklyBoxOfficeResponseDto.class);
  }
}
