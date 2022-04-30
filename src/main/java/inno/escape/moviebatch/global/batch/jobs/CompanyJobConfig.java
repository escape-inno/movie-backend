package inno.escape.moviebatch.global.batch.jobs;

import inno.escape.moviebatch.domain.company.service.CompanyService;
import inno.escape.moviebatch.global.batch.tasklets.CompanyTasklet;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class CompanyJobConfig {

  private final JobBuilderFactory jobBuilderFactory;
  private final StepBuilderFactory stepBuilderFactory;

  private final CompanyService companyService;

  @Bean(name = "companyJob")
  public Job companyJob() {
    return jobBuilderFactory.get("companyJob")
        .start(companyStep())
        .build();
  }

  @Bean(name = "companyStep")
  public Step companyStep() {
    return stepBuilderFactory.get("companyStep")
        .tasklet(new CompanyTasklet(companyService))
        .build();
  }
}
