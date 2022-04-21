package inno.escape.moviebatch.domain.movie.dto.list;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class MovieListRequestDto implements Serializable {

  private static final long serialVersionUID = -4198536769884107491L;

  @NotBlank(message = "발급받은 키 값을 입력해주세요.")
  private String key;

  // default 1
  private String curPage;

  // default 10
  private String itemPerPage;

  private String movieNm;

  private String directorNm;

  private String openStartDt;

  private String openEndDt;

  private String prdStartYear;

  private String prdEndYear;

  // default 전체
  // 공통코드 조회 서비스에서 "2204" 로서 조회된 코드 =>
  private String repNationCd;

  // default 전체
  // 공통코드 조회 서비스에서 "2201" 로서 조회된 코드 =>
  private String movieTypeCd;
}
