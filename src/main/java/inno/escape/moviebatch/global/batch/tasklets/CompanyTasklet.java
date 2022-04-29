package inno.escape.moviebatch.global.batch.tasklets;

import inno.escape.moviebatch.domain.company.dto.list.CompanyListRequestDto;
import inno.escape.moviebatch.domain.company.dto.list.CompanyListResponseDto;
import inno.escape.moviebatch.domain.company.service.CompanyService;
import inno.escape.moviebatch.global.Constants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Slf4j
public class CompanyTasklet implements Tasklet {

  private final CompanyService companyService;

  @Override
  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) {
    log.debug("Executed getCompanies Task");

    CompanyListRequestDto dto = CompanyListRequestDto.builder()
        .key(Constants.KEY)
        .build();

    Mono<CompanyListResponseDto> companyListResponseDtoMono = companyService.getCompanies(dto);
    companyListResponseDtoMono.subscribe(System.out::println);

    // @TODO Mono dto 를 db 에 저장하는 작업 추가

    return RepeatStatus.FINISHED;
  }
}
