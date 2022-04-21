package inno.escape.moviebatch.domain.movie.service;

import inno.escape.moviebatch.domain.movie.dto.info.MovieInfoRequestDto;
import inno.escape.moviebatch.domain.movie.dto.info.MovieInfoResponseDto;
import inno.escape.moviebatch.domain.movie.dto.list.MovieListRequestDto;
import inno.escape.moviebatch.domain.movie.dto.list.MovieListResponseDto;
import reactor.core.publisher.Mono;

public interface MovieService {

  Mono<MovieListResponseDto> getMovies(MovieListRequestDto dto);

  Mono<MovieInfoResponseDto> getMovie(MovieInfoRequestDto dto);
}
