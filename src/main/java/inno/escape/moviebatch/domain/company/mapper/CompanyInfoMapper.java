package inno.escape.moviebatch.domain.company.mapper;


import inno.escape.moviebatch.domain.company.dto.info.CompanyInfo;
import inno.escape.moviebatch.domain.company.entity.Company;
import inno.escape.moviebatch.global.model.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompanyInfoMapper extends GenericMapper<CompanyInfo, Company> {

  CompanyInfoMapper INSTANCE = Mappers.getMapper(CompanyInfoMapper.class);

  @Mapping(target = "code", source = "companyCd")
  @Mapping(target = "koreaName", source = "companyNm")
  @Mapping(target = "englishName", source = "companyNmEn")
  @Mapping(target = "ceoName", source = "ceoNm")
  @Override
  Company toEntity(CompanyInfo companyInfo);
}
