package inno.escape.moviebatch.domain.moviepeople.service;

import inno.escape.moviebatch.domain.moviepeople.dto.info.MoviePeopleRequestDto;
import inno.escape.moviebatch.domain.moviepeople.dto.list.MoviePeopleListRequestDto;
import inno.escape.moviebatch.domain.moviepeople.dto.list.MoviePeopleListResponseDto;
import reactor.core.publisher.Mono;

public interface MoviePeopleService {

  Mono<MoviePeopleListResponseDto> getMoviePeoples(MoviePeopleListRequestDto dto);

  Mono<MoviePeopleListResponseDto> getMoviePeople(MoviePeopleRequestDto dto);
}
