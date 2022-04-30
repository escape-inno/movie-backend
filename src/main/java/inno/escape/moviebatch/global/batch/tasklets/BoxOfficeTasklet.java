package inno.escape.moviebatch.global.batch.tasklets;

import inno.escape.moviebatch.domain.boxoffice.dto.daily.DailyBoxOfficeRequestDto;
import inno.escape.moviebatch.domain.boxoffice.service.BoxOfficeService;
import inno.escape.moviebatch.global.Constants;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

@RequiredArgsConstructor
@Slf4j
public class BoxOfficeTasklet implements Tasklet {

  private final BoxOfficeService boxOfficeService;

  @Override
  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) {
    log.debug("Executed getCompanies Task");

    String yesterday = DateTimeFormatter.BASIC_ISO_DATE.format(LocalDate.now().minusDays(1));

    DailyBoxOfficeRequestDto dto = DailyBoxOfficeRequestDto.builder()
        .key(Constants.KEY)
        .targetDt(yesterday)
        .build();

    boxOfficeService.getDailyBoxOffice(dto);

    return RepeatStatus.FINISHED;
  }
}
