package inno.escape.moviebatch.global.batch.schedulers;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CompanyScheduler implements SchedulerService {

  private final Job job;
  private final JobLauncher jobLauncher;
  private final TaskScheduler taskScheduler;

  private Map<String, ScheduledFuture<?>> scheduledFutureMap = new ConcurrentHashMap<>();

  public CompanyScheduler(@Qualifier("companyJob") Job job, JobLauncher jobLauncher,
      TaskScheduler taskScheduler) {
    this.job = job;
    this.jobLauncher = jobLauncher;
    this.taskScheduler = taskScheduler;
  }

  @Scheduled(cron = "0 2 0 * * *")
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

  @Override
  public void register() {
    ScheduledFuture<?> task = taskScheduler.scheduleAtFixedRate(() -> log.info(""), 20000);
    scheduledFutureMap.put("", task);
  }

  @Override
  public void remove() {
    scheduledFutureMap.get("").cancel(true);
  }
}
