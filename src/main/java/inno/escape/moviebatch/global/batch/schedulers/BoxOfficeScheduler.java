package inno.escape.moviebatch.global.batch.schedulers;

<<<<<<< master
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
=======
import java.time.LocalDateTime;
<<<<<<< HEAD
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
import org.springframework.stereotype.Service;
=======
<<<<<<< HEAD
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
=======
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
>>>>>>> 1f4203b... feat: batch 스케쥴러, 테스크 설정
>>>>>>> feat: batch 스케쥴러, 테스크 설정

@Service
@Slf4j
public class BoxOfficeScheduler implements SchedulerService {

  private final Job job;
  private final JobLauncher jobLauncher;
  private final TaskScheduler taskScheduler;

  private Map<String, ScheduledFuture<?>> scheduledFutureMap = new ConcurrentHashMap<>();

  public BoxOfficeScheduler(@Qualifier("boxOfficeJob") Job job, JobLauncher jobLauncher,
      TaskScheduler taskScheduler) {
    this.job = job;
    this.jobLauncher = jobLauncher;
    this.taskScheduler = taskScheduler;
  }

<<<<<<< master
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
=======
<<<<<<< HEAD
=======
  @Scheduled(cron = "0 3 0 * * *")
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
>>>>>>> feat: batch 스케쥴러, 테스크 설정

  @Override
  public void register() {
    ScheduledFuture<?> task = taskScheduler.scheduleAtFixedRate(() -> log.info(""), 20000);
    scheduledFutureMap.put("", task);
  }
<<<<<<< master
=======
>>>>>>> 1f4203b... feat: batch 스케쥴러, 테스크 설정
>>>>>>> feat: batch 스케쥴러, 테스크 설정

  @Override
  public void remove() {
    scheduledFutureMap.get("").cancel(true);
  }
}
