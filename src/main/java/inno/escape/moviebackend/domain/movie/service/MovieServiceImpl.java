package inno.escape.moviebackend.domain.movie.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import inno.escape.moviebackend.domain.movie.dto.info.MovieInfoRequestDto;
import inno.escape.moviebackend.domain.movie.dto.info.MovieInfoResponseDto;
import inno.escape.moviebackend.domain.movie.dto.list.MovieListRequestDto;
import inno.escape.moviebackend.domain.movie.dto.list.MovieListResponseDto;
import inno.escape.moviebackend.global.Constants.URL_PATH;
import inno.escape.moviebackend.global.util.MultiValueMapUtil;
import inno.escape.moviebackend.global.util.WebClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService {

  private final ObjectMapper objectMapper;

  @Override
  public Mono<MovieListResponseDto> getMovies(MovieListRequestDto dto) {
    MultiValueMap<String, String> listValueMap = MultiValueMapUtil.convert(objectMapper, dto);

    return WebClientUtil.getResponseSpec(URL_PATH.MOVIE_LIST.getValue(), listValueMap)
        .bodyToMono(MovieListResponseDto.class);
  }

  @Override
  public Mono<MovieInfoResponseDto> getMovie(MovieInfoRequestDto dto) {
    MultiValueMap<String, String> infoValueMap = MultiValueMapUtil.convert(objectMapper, dto);

    return WebClientUtil.getResponseSpec(URL_PATH.MOVIE_INFO.getValue(), infoValueMap)
        .bodyToMono(MovieInfoResponseDto.class);
  }
}
