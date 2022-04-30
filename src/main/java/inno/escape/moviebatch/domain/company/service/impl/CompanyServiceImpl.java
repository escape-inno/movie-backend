package inno.escape.moviebatch.domain.company.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import inno.escape.moviebatch.domain.company.dto.info.CompanyInfo;
import inno.escape.moviebatch.domain.company.dto.info.CompanyInfoRequestDto;
import inno.escape.moviebatch.domain.company.dto.info.CompanyInfoResponseDto;
import inno.escape.moviebatch.domain.company.dto.list.CompanyList;
import inno.escape.moviebatch.domain.company.dto.list.CompanyListRequestDto;
import inno.escape.moviebatch.domain.company.dto.list.CompanyListResponseDto;
import inno.escape.moviebatch.domain.company.entity.Company;
import inno.escape.moviebatch.domain.company.mapper.CompanyInfoMapper;
import inno.escape.moviebatch.domain.company.mapper.CompanyListMapper;
import inno.escape.moviebatch.domain.company.repository.CompanyRepository;
import inno.escape.moviebatch.domain.company.service.CompanyService;
import inno.escape.moviebatch.global.Constants.URL_PATH;
import inno.escape.moviebatch.global.util.MultiValueMapUtil;
import inno.escape.moviebatch.global.util.WebClientUtil;
import java.util.List;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class CompanyServiceImpl implements CompanyService {

  private final ObjectMapper objectMapper;
  private final CompanyRepository companyRepository;

  @Override
  public Mono<CompanyListResponseDto> getCompanies(CompanyListRequestDto dto) {
    MultiValueMap<String, String> listValueMap = MultiValueMapUtil.convert(objectMapper, dto);

    Mono<CompanyListResponseDto> companyListResponseDtoMono = WebClientUtil.getResponseSpec(
            URL_PATH.COMPANY_LIST.getValue(), listValueMap)
        .bodyToMono(CompanyListResponseDto.class);

    List<CompanyList> ds = Objects.requireNonNull(companyListResponseDtoMono.block())
        .getCompanyListResult().getCompanyList();

    List<Company> es = CompanyListMapper.INSTANCE.toEntityList(ds);
    companyRepository.saveAll(es);

    return companyListResponseDtoMono;
  }

  @Override
  public Mono<CompanyInfoResponseDto> getCompany(CompanyInfoRequestDto dto) {
    MultiValueMap<String, String> infoValueMap = MultiValueMapUtil.convert(objectMapper, dto);

    Mono<CompanyInfoResponseDto> companyInfoResponseDtoMono = WebClientUtil.getResponseSpec(
            URL_PATH.COMPANY_INFO.getValue(), infoValueMap)
        .bodyToMono(CompanyInfoResponseDto.class);

    CompanyInfo d = Objects.requireNonNull(companyInfoResponseDtoMono.block())
        .getCompanyInfoResult().getCompanyInfo();

    Company e = CompanyInfoMapper.INSTANCE.toEntity(d);
    companyRepository.save(e);

    return companyInfoResponseDtoMono;
  }
}
