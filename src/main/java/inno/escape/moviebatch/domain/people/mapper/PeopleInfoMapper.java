package inno.escape.moviebatch.domain.people.mapper;


import inno.escape.moviebatch.domain.people.dto.info.PeopleInfoDto;
import inno.escape.moviebatch.domain.people.entity.People;
import inno.escape.moviebatch.global.model.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PeopleInfoMapper extends GenericMapper<PeopleInfoDto, People> {

  PeopleInfoMapper INSTANCE = Mappers.getMapper(PeopleInfoMapper.class);

  @Override
  People toEntity(PeopleInfoDto peopleInfoDto);
}
