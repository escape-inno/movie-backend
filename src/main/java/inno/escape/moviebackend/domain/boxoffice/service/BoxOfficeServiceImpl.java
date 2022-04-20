package inno.escape.moviebackend.domain.boxoffice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import inno.escape.moviebackend.domain.boxoffice.dto.daily.DailyBoxOfficeRequestDto;
import inno.escape.moviebackend.domain.boxoffice.dto.daily.DailyBoxOfficeResponseDto;
import inno.escape.moviebackend.domain.boxoffice.dto.weekly.WeeklyBoxOfficeRequestDto;
import inno.escape.moviebackend.domain.boxoffice.dto.weekly.WeeklyBoxOfficeResponseDto;
import inno.escape.moviebackend.global.Constants.URL_PATH;
import inno.escape.moviebackend.global.util.MultiValueMapUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class BoxOfficeServiceImpl implements BoxOfficeService {

  private final WebClient webClient;

  private final ObjectMapper objectMapper;

  @Override
  public Mono<DailyBoxOfficeResponseDto> getDailyBoxOffice(DailyBoxOfficeRequestDto dto) {
    MultiValueMap<String, String> dailyValueMap = MultiValueMapUtil.convert(objectMapper, dto);

    return getResponseSpec(URL_PATH.DAILY.getValue(), dailyValueMap)
        .bodyToMono(DailyBoxOfficeResponseDto.class);
  }

  @Override
  public Mono<WeeklyBoxOfficeResponseDto> getWeeklyBoxOffice(WeeklyBoxOfficeRequestDto dto) {
    MultiValueMap<String, String> weeklyValueMap = MultiValueMapUtil.convert(objectMapper, dto);

    return getResponseSpec(URL_PATH.WEEKLY.getValue(), weeklyValueMap)
        .bodyToMono(WeeklyBoxOfficeResponseDto.class);
  }

  private WebClient.ResponseSpec getResponseSpec(String path,
      MultiValueMap<String, String> multiValueMap) {

    return webClient.get()
        .uri(uriBuilder -> uriBuilder
            .path(path)
            .queryParams(multiValueMap)
            .build())
        .accept(MediaType.APPLICATION_JSON)
        .retrieve();
  }
}
