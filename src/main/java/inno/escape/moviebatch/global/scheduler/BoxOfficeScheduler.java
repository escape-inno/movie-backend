package inno.escape.moviebatch.global.scheduler;

import inno.escape.moviebatch.domain.boxoffice.dto.daily.DailyBoxOfficeRequestDto;
import inno.escape.moviebatch.domain.boxoffice.service.BoxOfficeService;
import inno.escape.moviebatch.global.Constants;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class BoxOfficeScheduler implements SchedulerService {

  private final BoxOfficeService boxOfficeService;

  @Scheduled(cron = "0 3 0 * * *")
  @Override
  public void run() {
    String yesterday = DateTimeFormatter.BASIC_ISO_DATE.format(LocalDate.now().minusDays(1));

    DailyBoxOfficeRequestDto dto = DailyBoxOfficeRequestDto.builder()
        .key(Constants.KEY)
        .targetDt(yesterday)
        .build();

    boxOfficeService.getDailyBoxOffice(dto);
  }

  @Override
  public void register() {
  }

  @Override
  public void remove() {
  }
}
