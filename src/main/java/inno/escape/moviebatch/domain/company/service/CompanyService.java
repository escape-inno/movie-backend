package inno.escape.moviebatch.domain.company.service;

import inno.escape.moviebatch.domain.company.dto.info.CompanyInfoRequestDto;
import inno.escape.moviebatch.domain.company.dto.info.CompanyInfoResponseDto;
import inno.escape.moviebatch.domain.company.dto.list.CompanyListRequestDto;
import inno.escape.moviebatch.domain.company.dto.list.CompanyListResponseDto;
import reactor.core.publisher.Mono;

public interface CompanyService {

  Mono<CompanyListResponseDto> getCompanies(CompanyListRequestDto dto);

  Mono<CompanyInfoResponseDto> getCompany(CompanyInfoRequestDto dto);
}
