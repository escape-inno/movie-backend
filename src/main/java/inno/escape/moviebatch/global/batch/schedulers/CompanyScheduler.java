package inno.escape.moviebatch.global.batch.schedulers;

import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class CompanyScheduler {

  private final Job job;
  private final JobLauncher jobLauncher;

  @Scheduled(cron = "0 * * * * *")
  public void executeJob() {
    try {
      jobLauncher.run(
          job,
          new JobParametersBuilder()
              .addString("datetime", LocalDateTime.now().toString())
              .toJobParameters()  // job parameter 설정
      );
    } catch (JobExecutionException e) {
      log.error("Failed to execute job, {}", e.toString());
    }
  }


}
