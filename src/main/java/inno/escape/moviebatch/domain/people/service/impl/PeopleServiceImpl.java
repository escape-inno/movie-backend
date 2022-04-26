package inno.escape.moviebatch.domain.people.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import inno.escape.moviebatch.domain.people.dto.info.PeopleInfoRequestDto;
import inno.escape.moviebatch.domain.people.dto.info.PeopleInfoResponseDto;
import inno.escape.moviebatch.domain.people.dto.list.PeopleListRequestDto;
import inno.escape.moviebatch.domain.people.dto.list.PeopleListResponseDto;
import inno.escape.moviebatch.domain.people.service.PeopleService;
import inno.escape.moviebatch.global.Constants;
import inno.escape.moviebatch.global.util.MultiValueMapUtil;
import inno.escape.moviebatch.global.util.WebClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PeopleServiceImpl implements PeopleService {

    private final ObjectMapper objectMapper;

    @Override
    public Mono<PeopleListResponseDto> getMoviePeoples(PeopleListRequestDto dto) {

        MultiValueMap<String, String> listValueMap = MultiValueMapUtil.convert(objectMapper, dto);

        return WebClientUtil.getResponseSpec(Constants.URL_PATH.PEOPLE_LIST.getValue(),
                listValueMap)
            .bodyToMono(PeopleListResponseDto.class);
    }

    @Override
    public Mono<PeopleInfoResponseDto> getMoviePeople(PeopleInfoRequestDto dto) {

        MultiValueMap<String, String> listValueMap = MultiValueMapUtil.convert(objectMapper, dto);

        return WebClientUtil.getResponseSpec(Constants.URL_PATH.PEOPLE_INFO.getValue(),
                listValueMap)
            .bodyToMono(PeopleInfoResponseDto.class);
    }
}
