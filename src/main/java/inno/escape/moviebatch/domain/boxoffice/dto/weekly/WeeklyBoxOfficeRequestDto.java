package inno.escape.moviebatch.domain.boxoffice.dto.weekly;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class WeeklyBoxOfficeRequestDto implements Serializable {

  private static final long serialVersionUID = 1823303424716171683L;

  @NotBlank(message = "발급받은 키 값을 입력해주세요.")
  private String key;

  @Pattern(regexp = "((19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01]))", message = "조회하고자 하는 날짜를 yyyymmdd 형식으로 입력해주세요.")
  @NotBlank(message = "조회하고자 하는 날짜를 입력해주세요.")
  private String targetDt;

  // 0 주간(월~일) / default 1 주말(금~일) / 2 주중(월~목)
  private String weekGb;

  // default 10 / max 10
  private String itemPerPage;

  // default 전체 / Y 다양성 영화 / N 상업 영화
  private String multiMovieYn;

  // default 전체 / K 한국 영화 / F 외국 영화
  private String repNationCd;

  // default 전체 / 0105001 서울시 ~ 0105017 세종시
  private String wideAreaCd;
}
