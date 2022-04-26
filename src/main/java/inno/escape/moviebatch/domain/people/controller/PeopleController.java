package inno.escape.moviebatch.domain.people.controller;

import inno.escape.moviebatch.domain.people.dto.info.PeopleInfoRequestDto;
import inno.escape.moviebatch.domain.people.dto.info.PeopleInfoResponseDto;
import inno.escape.moviebatch.domain.people.dto.list.PeopleListRequestDto;
import inno.escape.moviebatch.domain.people.dto.list.PeopleListResponseDto;
import inno.escape.moviebatch.domain.people.service.PeopleService;
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
@RequestMapping("/people")
public class PeopleController {

    private final PeopleService peopleService;

    @GetMapping("/list")
    public ResponseEntity<Mono<PeopleListResponseDto>> getMoviePeopleList(
        @RequestBody @Valid PeopleListRequestDto dto) {
        Mono<PeopleListResponseDto> mono = peopleService.getMoviePeoples(dto);

        return ResponseEntity.status(HttpStatus.OK).body(mono);
    }

    @GetMapping("/info")
    public ResponseEntity<Mono<PeopleInfoResponseDto>> getMoviePeople(
        @RequestBody @Valid PeopleInfoRequestDto dto) {
        Mono<PeopleInfoResponseDto> mono = peopleService.getMoviePeople(dto);

        return ResponseEntity.status(HttpStatus.OK).body(mono);
    }
}
