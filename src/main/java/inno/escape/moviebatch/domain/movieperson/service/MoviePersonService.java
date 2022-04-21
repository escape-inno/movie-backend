package inno.escape.moviebatch.domain.movieperson.service;

import inno.escape.moviebatch.domain.movieperson.dto.info.MoviePersonRequestDto;
import inno.escape.moviebatch.domain.movieperson.dto.list.MoviePersonListRequestDto;
import inno.escape.moviebatch.domain.movieperson.dto.list.MoviePersonListResponseDto;
import reactor.core.publisher.Mono;

public interface MoviePersonService {

    Mono<MoviePersonListResponseDto> getMoviePeopleList(MoviePersonListRequestDto dto);

    Mono<MoviePersonListResponseDto> getMoviePeople(MoviePersonRequestDto dto);
}
