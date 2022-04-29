package inno.escape.moviebatch.domain.company.mapper;


import inno.escape.moviebatch.domain.company.dto.list.CompanyListResponseDto;
import inno.escape.moviebatch.domain.company.entity.Company;
import inno.escape.moviebatch.global.model.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompanyResponseMapper extends GenericMapper<Company, CompanyListResponseDto> {

  CompanyResponseMapper INSTANCE = Mappers.getMapper(CompanyResponseMapper.class);
}
