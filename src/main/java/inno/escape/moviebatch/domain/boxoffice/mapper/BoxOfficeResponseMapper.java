package inno.escape.moviebatch.domain.boxoffice.mapper;


import inno.escape.moviebatch.domain.boxoffice.dto.daily.DailyBoxOfficeResponseDto;
import inno.escape.moviebatch.domain.boxoffice.entity.BoxOffice;
import inno.escape.moviebatch.global.model.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BoxOfficeResponseMapper extends
    GenericMapper<BoxOffice, DailyBoxOfficeResponseDto> {

  BoxOfficeResponseMapper INSTANCE = Mappers.getMapper(BoxOfficeResponseMapper.class);
}
