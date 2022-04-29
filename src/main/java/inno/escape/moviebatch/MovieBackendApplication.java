package inno.escape.moviebatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableBatchProcessing
@SpringBootApplication
public class MovieBackendApplication {

  public static void main(String[] args) {
    SpringApplication.run(MovieBackendApplication.class, args);
  }

}
