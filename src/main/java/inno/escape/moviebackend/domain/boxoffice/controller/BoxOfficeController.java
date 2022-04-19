package inno.escape.moviebackend.domain.boxoffice.controller;

import inno.escape.moviebackend.domain.boxoffice.dto.DailyBoxOfficeRequestDto;
import inno.escape.moviebackend.domain.boxoffice.dto.DailyBoxOfficeResponseDto;
import inno.escape.moviebackend.domain.boxoffice.dto.WeeklyBoxOfficeRequestDto;
import inno.escape.moviebackend.domain.boxoffice.dto.WeeklyBoxOfficeResponseDto;
import inno.escape.moviebackend.domain.boxoffice.service.BoxOfficeService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/boxoffice")
public class BoxOfficeController {

  private final BoxOfficeService boxOfficeService;

  @GetMapping("/daily")
  public Mono<DailyBoxOfficeResponseDto> getDailyBoxOffice(
      @RequestBody @Valid DailyBoxOfficeRequestDto dto) {

    return boxOfficeService.getDailyBoxOffice(dto);
  }

  @GetMapping("/weekly")
  public Mono<WeeklyBoxOfficeResponseDto> getWeeklyBoxOffice(
      @RequestBody @Valid WeeklyBoxOfficeRequestDto dto) {

    return boxOfficeService.getWeeklyBoxOffice(dto);
  }
}
