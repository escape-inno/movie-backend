package inno.escape.moviebatch.domain.movie.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import inno.escape.moviebatch.domain.company.mapper.CompanyInfoMapper;
import inno.escape.moviebatch.domain.movie.dto.info.MovieInfo;
import inno.escape.moviebatch.domain.movie.dto.info.MovieInfoRequestDto;
import inno.escape.moviebatch.domain.movie.dto.info.MovieInfoResponseDto;
import inno.escape.moviebatch.domain.movie.dto.list.MovieList;
import inno.escape.moviebatch.domain.movie.dto.list.MovieListRequestDto;
import inno.escape.moviebatch.domain.movie.dto.list.MovieListResponseDto;
import inno.escape.moviebatch.domain.movie.entity.Movie;
import inno.escape.moviebatch.domain.movie.mapper.MovieInfoMapper;
import inno.escape.moviebatch.domain.movie.mapper.MovieListMapper;
import inno.escape.moviebatch.domain.movie.repository.MovieRepository;
import inno.escape.moviebatch.domain.movie.service.MovieService;
import inno.escape.moviebatch.global.Constants.URL_PATH;
import inno.escape.moviebatch.global.util.MultiValueMapUtil;
import inno.escape.moviebatch.global.util.WebClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService {

  private final ObjectMapper objectMapper;
  private final MovieRepository movieRepository;

  @Override
  public Mono<MovieListResponseDto> getMovies(MovieListRequestDto dto) {
    MultiValueMap<String, String> listValueMap = MultiValueMapUtil.convert(objectMapper, dto);

    Mono<MovieListResponseDto> movieListResponseDtoMono = WebClientUtil.getResponseSpec(URL_PATH.MOVIE_LIST.getValue(), listValueMap)
            .bodyToMono(MovieListResponseDto.class);

    List<MovieList> ds = Objects.requireNonNull(movieListResponseDtoMono.block())
            .getMovieListResult().getMovieList();
    List<Movie> es = MovieListMapper.INSTANCE.toEntityList(ds);
    movieRepository.saveAll(es);

    return movieListResponseDtoMono;
  }

  @Override
  public Mono<MovieInfoResponseDto> getMovie(MovieInfoRequestDto dto) {
    MultiValueMap<String, String> infoValueMap = MultiValueMapUtil.convert(objectMapper, dto);

    Mono<MovieInfoResponseDto> movieInfoResponseDtoMono = WebClientUtil.getResponseSpec(URL_PATH.MOVIE_INFO.getValue(), infoValueMap)
            .bodyToMono(MovieInfoResponseDto.class);

    MovieInfo d = Objects.requireNonNull(movieInfoResponseDtoMono.block())
            .getMovieInfoResult().getMovieInfo();
    Movie e = MovieInfoMapper.INSTANCE.toEntity(d);
    movieRepository.save(e);

    return movieInfoResponseDtoMono;
  }
}
