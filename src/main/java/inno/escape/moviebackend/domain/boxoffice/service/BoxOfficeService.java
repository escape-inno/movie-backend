package inno.escape.moviebackend.domain.boxoffice.service;

import inno.escape.moviebackend.domain.boxoffice.dto.DailyBoxOfficeRequestDto;
import inno.escape.moviebackend.domain.boxoffice.dto.DailyBoxOfficeResponseDto;
import inno.escape.moviebackend.domain.boxoffice.dto.WeeklyBoxOfficeRequestDto;
import inno.escape.moviebackend.domain.boxoffice.dto.WeeklyBoxOfficeResponseDto;
import reactor.core.publisher.Mono;

public interface BoxOfficeService {

  Mono<DailyBoxOfficeResponseDto> getDailyBoxOffice(DailyBoxOfficeRequestDto dto);

  Mono<WeeklyBoxOfficeResponseDto> getWeeklyBoxOffice(WeeklyBoxOfficeRequestDto dto);
}
