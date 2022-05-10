package inno.escape.moviebatch.global.scheduler;

import inno.escape.moviebatch.domain.company.dto.list.CompanyListRequestDto;
import inno.escape.moviebatch.domain.company.service.CompanyService;
import inno.escape.moviebatch.global.Constants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class CompanyScheduler implements SchedulerService {

  private final CompanyService companyService;
  private int page = 1;

  @Scheduled(cron = "0 2 0 * * *")
  @Override
  public void run() {
    log.debug("Executed getCompanies Task");

    CompanyListRequestDto dto = CompanyListRequestDto.builder()
        .key(Constants.KEY)
        .curPage(Integer.toString(page))
        .curPage(Integer.toString(page))
        .itemPerPage(Integer.toString(100))
        .build();
    page += 1;

    companyService.getCompanies(dto);
  }

  @Override
  public void register() {
  }

  @Override
  public void remove() {
  }
}
