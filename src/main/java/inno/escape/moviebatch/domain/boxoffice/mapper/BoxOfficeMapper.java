package inno.escape.moviebatch.domain.boxoffice.mapper;


import inno.escape.moviebatch.domain.boxoffice.dto.BoxOfficeResultDto;
import inno.escape.moviebatch.domain.boxoffice.entity.BoxOffice;
import inno.escape.moviebatch.global.model.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BoxOfficeMapper extends GenericMapper<BoxOfficeResultDto, BoxOffice> {

  BoxOfficeMapper INSTANCE = Mappers.getMapper(BoxOfficeMapper.class);

  @Mapping(target = "ranking", source = "rank")
  @Override
  BoxOffice toEntity(BoxOfficeResultDto boxOfficeResult);
}
