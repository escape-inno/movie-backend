package inno.escape.moviebatch.domain.movieperson.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import inno.escape.moviebatch.domain.movie.dto.list.MovieListRequestDto;
import inno.escape.moviebatch.domain.movie.dto.list.MovieListResponseDto;
import inno.escape.moviebatch.domain.movieperson.dto.info.MoviePersonRequestDto;
import inno.escape.moviebatch.domain.movieperson.dto.list.MoviePersonListRequestDto;
import inno.escape.moviebatch.domain.movieperson.dto.list.MoviePersonListResponseDto;
import inno.escape.moviebatch.domain.movieperson.service.MoviePersonService;
import inno.escape.moviebatch.global.Constants;
import inno.escape.moviebatch.global.util.MultiValueMapUtil;
import inno.escape.moviebatch.global.util.WebClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MoviePersonServiceImpl implements MoviePersonService {

    private final ObjectMapper objectMapper;

    @Override
    public Mono<MoviePersonListResponseDto> getMoviePeopleList(MoviePersonListRequestDto dto) {

        MultiValueMap<String, String> listValueMap = MultiValueMapUtil.convert(objectMapper, dto);

        return WebClientUtil.getResponseSpec(Constants.URL_PATH.MOVIE_PERSON_LIST.getValue(), listValueMap)
                .bodyToMono(MoviePersonListResponseDto.class);
    }

    @Override
    public Mono<MoviePersonListResponseDto> getMoviePeople(MoviePersonRequestDto dto) {

        MultiValueMap<String, String> listValueMap = MultiValueMapUtil.convert(objectMapper, dto);

        return WebClientUtil.getResponseSpec(Constants.URL_PATH.MOVIE_PERSON_INFO.getValue(), listValueMap)
                .bodyToMono(MoviePersonListResponseDto.class);
    }
}
