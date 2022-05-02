package inno.escape.moviebatch.domain.movie.mapper;

import inno.escape.moviebatch.domain.movie.dto.list.MovieList;
import inno.escape.moviebatch.domain.movie.entity.Movie;
import inno.escape.moviebatch.global.model.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MovieListMapper extends GenericMapper<MovieList, Movie> {

    MovieListMapper INSTANCE = Mappers.getMapper(MovieListMapper.class);
}
