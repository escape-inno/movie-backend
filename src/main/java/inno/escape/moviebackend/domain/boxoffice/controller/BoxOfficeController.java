package inno.escape.moviebackend.domain.boxoffice.controller;

import inno.escape.moviebackend.domain.boxoffice.dto.DailyBoxOfficeRequestDto;
import inno.escape.moviebackend.domain.boxoffice.dto.DailyBoxOfficeResponseDto;
import javax.validation.Valid;
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

  private final WebClient webClient;

  @GetMapping("/daily")
  public Mono<DailyBoxOfficeResponseDto> getDailyBoxOffice(
      @RequestBody @Valid DailyBoxOfficeRequestDto dto) {

    // @Todo uriBuilder(path, dto) 구현 필요
    return webClient.get()
        .uri(uriBuilder -> uriBuilder
            .path("/boxoffice/searchDailyBoxOfficeList.json")
            .queryParam("key", dto.getKey())
            .queryParam("targetDt", dto.getTargetDt())
            .queryParam("itemPerPage", dto.getItemPerPage())
            .queryParam("multiMovieYn", dto.getMultiMovieYn())
            .queryParam("repNationCd", dto.getRepNationCd())
            .queryParam("wideAreaCd", dto.getWideAreaCd())
            .build())
        .accept(MediaType.APPLICATION_JSON)
        .retrieve()
        .bodyToMono(DailyBoxOfficeResponseDto.class);
  }
}
