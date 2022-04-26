package inno.escape.moviebatch.domain.people.service;

import inno.escape.moviebatch.domain.people.dto.info.PeopleInfoRequestDto;
import inno.escape.moviebatch.domain.people.dto.info.PeopleInfoResponseDto;
import inno.escape.moviebatch.domain.people.dto.list.PeopleListRequestDto;
import inno.escape.moviebatch.domain.people.dto.list.PeopleListResponseDto;
import reactor.core.publisher.Mono;

public interface PeopleService {

  Mono<PeopleListResponseDto> getMoviePeoples(PeopleListRequestDto dto);

  Mono<PeopleInfoResponseDto> getMoviePeople(PeopleInfoRequestDto dto);
}
