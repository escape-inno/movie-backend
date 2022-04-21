package inno.escape.moviebatch.domain.movie.controller;

import inno.escape.moviebatch.domain.movie.dto.info.MovieInfoRequestDto;
import inno.escape.moviebatch.domain.movie.dto.info.MovieInfoResponseDto;
import inno.escape.moviebatch.domain.movie.dto.list.MovieListRequestDto;
import inno.escape.moviebatch.domain.movie.dto.list.MovieListResponseDto;
import inno.escape.moviebatch.domain.movie.service.MovieService;
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
@RequestMapping("/movie")
public class MovieController {

  private final MovieService movieService;

  @GetMapping("/list")
  public ResponseEntity<Mono<MovieListResponseDto>> getCompanies(
      @RequestBody @Valid MovieListRequestDto dto) {
    Mono<MovieListResponseDto> mono = movieService.getMovies(dto);

    return ResponseEntity.status(HttpStatus.OK).body(mono);
  }

  @GetMapping("/info")
  public ResponseEntity<Mono<MovieInfoResponseDto>> getMovie(
      @RequestBody @Valid MovieInfoRequestDto dto) {
    Mono<MovieInfoResponseDto> mono = movieService.getMovie(dto);

    return ResponseEntity.status(HttpStatus.OK).body(mono);
  }
}
