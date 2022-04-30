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
  private int page = 1;

  @Override
  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) {
    log.debug("Executed getCompanies Task");

    CompanyListRequestDto dto = CompanyListRequestDto.builder()
        .key(Constants.KEY)
        .curPage(Integer.toString(page))
        .build();
    page += 1;

    Mono<CompanyListResponseDto> companyListResponseDtoMono = companyService.getCompanies(dto);
    companyListResponseDtoMono.subscribe(System.out::println);

    return RepeatStatus.FINISHED;
  }
}
