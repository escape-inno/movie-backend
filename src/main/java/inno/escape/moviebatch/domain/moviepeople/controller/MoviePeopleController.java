package inno.escape.moviebatch.domain.moviepeople.controller;

import inno.escape.moviebatch.domain.moviepeople.dto.info.MoviePeopleRequestDto;
import inno.escape.moviebatch.domain.moviepeople.dto.list.MoviePeopleListRequestDto;
import inno.escape.moviebatch.domain.moviepeople.dto.list.MoviePeopleListResponseDto;
import inno.escape.moviebatch.domain.moviepeople.service.MoviePeopleService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController("/moviepeople")
public class MoviePeopleController {

    private final MoviePeopleService moviePeopleService;

    @GetMapping("/list")
    public ResponseEntity<Mono<MoviePeopleListResponseDto>> getMoviePeopleList(
        @RequestBody @Valid MoviePeopleListRequestDto dto) {
        Mono<MoviePeopleListResponseDto> mono = moviePeopleService.getMoviePeoples(dto);

        return ResponseEntity.status(HttpStatus.OK).body(mono);
    }

    @GetMapping("/info")
    public ResponseEntity<Mono<MoviePeopleListResponseDto>> getMoviePeople(
        @RequestBody @Valid MoviePeopleRequestDto dto) {
        Mono<MoviePeopleListResponseDto> mono = moviePeopleService.getMoviePeople(dto);

        return ResponseEntity.status(HttpStatus.OK).body(mono);
    }
}
