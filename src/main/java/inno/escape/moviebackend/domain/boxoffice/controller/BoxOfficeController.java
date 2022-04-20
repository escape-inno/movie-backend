package inno.escape.moviebackend.domain.boxoffice.controller;

import inno.escape.moviebackend.domain.boxoffice.dto.daily.DailyBoxOfficeRequestDto;
import inno.escape.moviebackend.domain.boxoffice.dto.daily.DailyBoxOfficeResponseDto;
import inno.escape.moviebackend.domain.boxoffice.dto.weekly.WeeklyBoxOfficeRequestDto;
import inno.escape.moviebackend.domain.boxoffice.dto.weekly.WeeklyBoxOfficeResponseDto;
import inno.escape.moviebackend.domain.boxoffice.service.BoxOfficeService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/boxoffices")
public class BoxOfficeController {

  private final BoxOfficeService boxOfficeService;

  @GetMapping("/daily")
  public ResponseEntity<Mono<DailyBoxOfficeResponseDto>> getDailyBoxOffice(
      @RequestBody @Valid DailyBoxOfficeRequestDto dto) {
    Mono<DailyBoxOfficeResponseDto> mono = boxOfficeService.getDailyBoxOffice(dto);

    return ResponseEntity.status(HttpStatus.OK).body(mono);
  }

  @GetMapping("/weekly")
  public ResponseEntity<Mono<WeeklyBoxOfficeResponseDto>> getWeeklyBoxOffice(
      @RequestBody @Valid WeeklyBoxOfficeRequestDto dto) {
    Mono<WeeklyBoxOfficeResponseDto> mono = boxOfficeService.getWeeklyBoxOffice(dto);

    return ResponseEntity.status(HttpStatus.OK).body(mono);
  }
}
