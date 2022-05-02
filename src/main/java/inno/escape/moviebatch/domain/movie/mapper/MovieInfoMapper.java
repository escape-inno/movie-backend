package inno.escape.moviebatch.domain.movie.mapper;

import inno.escape.moviebatch.domain.movie.dto.info.MovieInfo;
import inno.escape.moviebatch.domain.movie.entity.Movie;
import inno.escape.moviebatch.global.model.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MovieInfoMapper extends GenericMapper<MovieInfo, Movie> {

    MovieInfoMapper INSTANCE = Mappers.getMapper(MovieInfoMapper.class);

}
