package inno.escape.moviebackend.domain.boxoffice.controller;

import inno.escape.moviebackend.domain.boxoffice.dto.DailyBoxOfficeRequestDto;
import inno.escape.moviebackend.domain.boxoffice.dto.DailyBoxOfficeResponseDto;
import inno.escape.moviebackend.global.Constants.KOBIS;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/boxoffice")
public class BoxOfficeController {

  @GetMapping("/daily")
  public Mono<DailyBoxOfficeResponseDto> getDailyBoxOffice(
      @RequestBody DailyBoxOfficeRequestDto dto) {

    // @Todo webClient 공통 처리 필요
    return WebClient.create()
        .get()
        .uri(uriBuilder -> uriBuilder
            .scheme(KOBIS.SCHEME.getValue())
            .host(KOBIS.HOST.getValue())
            .path(KOBIS.BASE_PATH.getValue() + "/boxoffice/searchDailyBoxOfficeList.json")
            .queryParam("key", dto.getKey())
            .queryParam("targetDt", dto.getTargetDt())
            .build()
        )
        .accept(MediaType.APPLICATION_JSON)
        .retrieve()
        .bodyToMono(DailyBoxOfficeResponseDto.class);
  }
}
