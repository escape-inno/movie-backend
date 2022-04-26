package inno.escape.moviebatch.domain.boxoffice.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import inno.escape.moviebatch.domain.boxoffice.dto.daily.DailyBoxOfficeRequestDto;
import inno.escape.moviebatch.domain.boxoffice.dto.daily.DailyBoxOfficeResponseDto;
import inno.escape.moviebatch.domain.boxoffice.dto.weekly.WeeklyBoxOfficeRequestDto;
import inno.escape.moviebatch.domain.boxoffice.dto.weekly.WeeklyBoxOfficeResponseDto;
import inno.escape.moviebatch.domain.boxoffice.service.BoxOfficeService;
import inno.escape.moviebatch.global.Constants.URL_PATH;
import inno.escape.moviebatch.global.util.MultiValueMapUtil;
import inno.escape.moviebatch.global.util.WebClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class BoxOfficeServiceImpl implements BoxOfficeService {

  private final ObjectMapper objectMapper;

  @Override
  public Mono<DailyBoxOfficeResponseDto> getDailyBoxOffice(DailyBoxOfficeRequestDto dto) {
    MultiValueMap<String, String> dailyValueMap = MultiValueMapUtil.convert(objectMapper, dto);

    return WebClientUtil.getResponseSpec(URL_PATH.DAILY.getValue(), dailyValueMap)
        .bodyToMono(DailyBoxOfficeResponseDto.class);
  }

  @Override
  public Mono<WeeklyBoxOfficeResponseDto> getWeeklyBoxOffice(WeeklyBoxOfficeRequestDto dto) {
    MultiValueMap<String, String> weeklyValueMap = MultiValueMapUtil.convert(objectMapper, dto);

    return WebClientUtil.getResponseSpec(URL_PATH.WEEKLY.getValue(), weeklyValueMap)
        .bodyToMono(WeeklyBoxOfficeResponseDto.class);
  }
}