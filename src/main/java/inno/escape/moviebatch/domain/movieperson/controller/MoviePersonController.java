package inno.escape.moviebatch.domain.movieperson.controller;

import inno.escape.moviebatch.domain.movie.dto.list.MovieListRequestDto;
import inno.escape.moviebatch.domain.movie.dto.list.MovieListResponseDto;
import inno.escape.moviebatch.domain.movieperson.dto.info.MoviePersonRequestDto;
import inno.escape.moviebatch.domain.movieperson.dto.list.MoviePersonListRequestDto;
import inno.escape.moviebatch.domain.movieperson.dto.list.MoviePersonListResponseDto;
import inno.escape.moviebatch.domain.movieperson.service.MoviePersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController("/moviepeople")
public class MoviePersonController {

    private final MoviePersonService moviePersonService;

    @GetMapping("/list")
    public ResponseEntity<Mono<MoviePersonListResponseDto>> getMoviePeopleList(
            @RequestBody @Valid MoviePersonListRequestDto dto) {
        Mono<MoviePersonListResponseDto> mono = moviePersonService.getMoviePeopleList(dto);

        return ResponseEntity.status(HttpStatus.OK).body(mono);
    }

    @GetMapping("/info")
    public ResponseEntity<Mono<MoviePersonListResponseDto>> getMoviePeople(
            @RequestBody @Valid MoviePersonRequestDto dto) {
        Mono<MoviePersonListResponseDto> mono = moviePersonService.getMoviePeople(dto);

        return ResponseEntity.status(HttpStatus.OK).body(mono);
    }
}
