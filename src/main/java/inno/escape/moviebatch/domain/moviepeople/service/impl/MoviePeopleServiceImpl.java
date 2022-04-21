package inno.escape.moviebatch.domain.moviepeople.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import inno.escape.moviebatch.domain.moviepeople.dto.info.MoviePeopleRequestDto;
import inno.escape.moviebatch.domain.moviepeople.dto.list.MoviePeopleListRequestDto;
import inno.escape.moviebatch.domain.moviepeople.dto.list.MoviePeopleListResponseDto;
import inno.escape.moviebatch.domain.moviepeople.service.MoviePeopleService;
import inno.escape.moviebatch.global.Constants;
import inno.escape.moviebatch.global.util.MultiValueMapUtil;
import inno.escape.moviebatch.global.util.WebClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MoviePeopleServiceImpl implements MoviePeopleService {

    private final ObjectMapper objectMapper;

    @Override
    public Mono<MoviePeopleListResponseDto> getMoviePeoples(MoviePeopleListRequestDto dto) {

        MultiValueMap<String, String> listValueMap = MultiValueMapUtil.convert(objectMapper, dto);

        return WebClientUtil.getResponseSpec(Constants.URL_PATH.MOVIE_PEOPLE_LIST.getValue(),
                listValueMap)
            .bodyToMono(MoviePeopleListResponseDto.class);
    }

    @Override
    public Mono<MoviePeopleListResponseDto> getMoviePeople(MoviePeopleRequestDto dto) {

        MultiValueMap<String, String> listValueMap = MultiValueMapUtil.convert(objectMapper, dto);

        return WebClientUtil.getResponseSpec(Constants.URL_PATH.MOVIE_PEOPLE_INFO.getValue(),
                listValueMap)
            .bodyToMono(MoviePeopleListResponseDto.class);
    }
}
