package inno.escape.moviebatch.global.batch.tasklets;

import inno.escape.moviebatch.domain.boxoffice.dto.daily.DailyBoxOfficeRequestDto;
import inno.escape.moviebatch.domain.boxoffice.dto.daily.DailyBoxOfficeResponseDto;
import inno.escape.moviebatch.domain.boxoffice.service.BoxOfficeService;
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
public class BoxOfficeTasklet implements Tasklet {

  private final BoxOfficeService boxOfficeService;

  @Override
  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) {
    log.debug("Executed getCompanies Task");

    DailyBoxOfficeRequestDto dto = DailyBoxOfficeRequestDto.builder()
        .key(Constants.KEY)
        .build();

    Mono<DailyBoxOfficeResponseDto> companyListResponseDtoMono = boxOfficeService.getDailyBoxOffice(
        dto);
    companyListResponseDtoMono.subscribe(System.out::println);

    // @TODO Mono dto 를 db 에 저장하는 작업 추가

    return RepeatStatus.FINISHED;
  }
}
