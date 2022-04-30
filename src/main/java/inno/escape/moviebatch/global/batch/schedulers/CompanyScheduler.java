package inno.escape.moviebatch.global.batch.schedulers;

<<<<<<< HEAD
import java.time.LocalDateTime;
<<<<<<< master
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
=======
import lombok.RequiredArgsConstructor;
=======
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
>>>>>>> 1f4203b... feat: batch 스케쥴러, 테스크 설정
>>>>>>> feat: batch 스케쥴러, 테스크 설정
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
<<<<<<< master
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
=======
<<<<<<< HEAD
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
=======
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Service;
>>>>>>> 1f4203b... feat: batch 스케쥴러, 테스크 설정
>>>>>>> feat: batch 스케쥴러, 테스크 설정

@Service
@Slf4j
public class CompanyScheduler implements SchedulerService {

  private final Job job;
  private final JobLauncher jobLauncher;
  private final TaskScheduler taskScheduler;

<<<<<<< master
  private Map<String, ScheduledFuture<?>> scheduledFutureMap = new ConcurrentHashMap<>();

  public CompanyScheduler(@Qualifier("companyJob") Job job, JobLauncher jobLauncher,
      TaskScheduler taskScheduler) {
    this.job = job;
    this.jobLauncher = jobLauncher;
    this.taskScheduler = taskScheduler;
  }

  @Scheduled(cron = "0/20 * * * * *")
=======
<<<<<<< HEAD
  @Scheduled(cron = "0 * * * * *")
>>>>>>> feat: batch 스케쥴러, 테스크 설정
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
=======
  private Map<String, ScheduledFuture<?>> scheduledFutureMap = new ConcurrentHashMap<>();

  public CompanyScheduler(@Qualifier("companyJob") Job job, JobLauncher jobLauncher,
      TaskScheduler taskScheduler) {
    this.job = job;
    this.jobLauncher = jobLauncher;
    this.taskScheduler = taskScheduler;
  }

//  @Scheduled(cron = "0 * * * * *")
//  public void executeJob() {
//    try {
//      jobLauncher.run(
//          job,
//          new JobParametersBuilder()
//              .addString("datetime", LocalDateTime.now().toString())
//              .toJobParameters()  // job parameter 설정
//      );
//    } catch (JobExecutionException e) {
//      log.error("Failed to execute job, {}", e.toString());
//    }
//  }
>>>>>>> 1f4203b... feat: batch 스케쥴러, 테스크 설정

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
