package inno.escape.moviebatch.domain.boxoffice.service;

import inno.escape.moviebatch.domain.boxoffice.dto.daily.DailyBoxOfficeRequestDto;
import inno.escape.moviebatch.domain.boxoffice.dto.daily.DailyBoxOfficeResponseDto;
import inno.escape.moviebatch.domain.boxoffice.dto.weekly.WeeklyBoxOfficeRequestDto;
import inno.escape.moviebatch.domain.boxoffice.dto.weekly.WeeklyBoxOfficeResponseDto;
import reactor.core.publisher.Mono;

public interface BoxOfficeService {

  Mono<DailyBoxOfficeResponseDto> getDailyBoxOffice(DailyBoxOfficeRequestDto dto);

  Mono<WeeklyBoxOfficeResponseDto> getWeeklyBoxOffice(WeeklyBoxOfficeRequestDto dto);
}
