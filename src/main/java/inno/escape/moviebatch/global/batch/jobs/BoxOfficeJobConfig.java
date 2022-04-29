package inno.escape.moviebatch.global.batch.jobs;

import inno.escape.moviebatch.domain.boxoffice.service.BoxOfficeService;
import inno.escape.moviebatch.global.batch.tasklets.BoxOfficeTasklet;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class BoxOfficeJobConfig {

  private final JobBuilderFactory jobBuilderFactory;
  private final StepBuilderFactory stepBuilderFactory;

  private final BoxOfficeService boxOfficeService;

  @Bean
  public Job companyJob() {
    return jobBuilderFactory.get("boxOfficeJob")
        .start(companyStep())
        .build();
  }

  @Bean
  public Step companyStep() {
    return stepBuilderFactory.get("boxOfficeStep")
        .tasklet(new BoxOfficeTasklet(boxOfficeService))
        .build();
  }
}
