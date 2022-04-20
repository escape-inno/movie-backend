package inno.escape.moviebackend.domain.company.controller;

import inno.escape.moviebackend.domain.company.dto.info.CompanyInfoRequestDto;
import inno.escape.moviebackend.domain.company.dto.info.CompanyInfoResponseDto;
import inno.escape.moviebackend.domain.company.dto.list.CompanyListRequestDto;
import inno.escape.moviebackend.domain.company.dto.list.CompanyListResponseDto;
import inno.escape.moviebackend.domain.company.service.CompanyService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/companies")
public class CompanyController {

  private final CompanyService companyService;

  @GetMapping("/list")
  public ResponseEntity<Mono<CompanyListResponseDto>> getCompanies(
      @RequestBody @Valid CompanyListRequestDto dto) {
    Mono<CompanyListResponseDto> mono = companyService.getCompanies(dto);

    return ResponseEntity.status(HttpStatus.OK).body(mono);
  }

  @GetMapping("/info")
  public ResponseEntity<Mono<CompanyInfoResponseDto>> getCompany(
      @RequestBody @Valid CompanyInfoRequestDto dto) {
    Mono<CompanyInfoResponseDto> mono = companyService.getCompany(dto);

    return ResponseEntity.status(HttpStatus.OK).body(mono);
  }
}
