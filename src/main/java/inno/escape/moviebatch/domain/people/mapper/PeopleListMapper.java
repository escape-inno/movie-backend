package inno.escape.moviebatch.domain.people.mapper;


import inno.escape.moviebatch.domain.people.dto.list.PeopleListDto;
import inno.escape.moviebatch.domain.people.entity.People;
import inno.escape.moviebatch.global.model.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PeopleListMapper extends GenericMapper<PeopleListDto, People> {

  PeopleListMapper INSTANCE = Mappers.getMapper(PeopleListMapper.class);

  @Override
  People toEntity(PeopleListDto peopleListDto);
}
