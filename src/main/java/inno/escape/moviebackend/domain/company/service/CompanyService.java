package inno.escape.moviebackend.domain.company.service;

import inno.escape.moviebackend.domain.company.dto.info.CompanyInfoRequestDto;
import inno.escape.moviebackend.domain.company.dto.info.CompanyInfoResponseDto;
import inno.escape.moviebackend.domain.company.dto.list.CompanyListRequestDto;
import inno.escape.moviebackend.domain.company.dto.list.CompanyListResponseDto;
import reactor.core.publisher.Mono;

public interface CompanyService {

  Mono<CompanyListResponseDto> getCompanies(CompanyListRequestDto dto);

  Mono<CompanyInfoResponseDto> getCompany(CompanyInfoRequestDto dto);
}
