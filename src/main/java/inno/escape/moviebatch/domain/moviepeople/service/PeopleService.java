package inno.escape.moviebatch.domain.moviepeople.service;

import inno.escape.moviebatch.domain.moviepeople.dto.info.PeopleInfoRequestDto;
import inno.escape.moviebatch.domain.moviepeople.dto.info.PeopleInfoResponseDto;
import inno.escape.moviebatch.domain.moviepeople.dto.info.PeopleInfoResult;
import inno.escape.moviebatch.domain.moviepeople.dto.list.PeopleListRequestDto;
import inno.escape.moviebatch.domain.moviepeople.dto.list.PeopleListResponseDto;
import reactor.core.publisher.Mono;

public interface PeopleService {

  Mono<PeopleListResponseDto> getMoviePeoples(PeopleListRequestDto dto);

  Mono<PeopleInfoResponseDto> getMoviePeople(PeopleInfoRequestDto dto);
}
