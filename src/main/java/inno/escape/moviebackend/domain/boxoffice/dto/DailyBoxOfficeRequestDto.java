package inno.escape.moviebackend.domain.boxoffice.dto;

import com.sun.istack.NotNull;
import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class DailyBoxOfficeRequestDto implements Serializable {

  @NotNull
  private String key;

  @NotNull
  private String targetDt;

  // default 10 / max 10
  private String itemPerPage;

  // default 전체 / Y 다양성 영화 / N 상업 영화
  private String multiMovieYn;

  // default 전체 / K 한국 영화 / F 외국 영화
  private String repNationCd;

  // default 전체 / 0105001 서울시 ~ 0105017 세종시
  private String wideAreaCd;
}
