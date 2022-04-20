package inno.escape.moviebackend.domain.boxoffice.dto;

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
public class BoxOfficeResult implements Serializable {

  private static final long serialVersionUID = 8446102317673471251L;

  private String rnum;

  private String rank;

  private String rankInten;

  // "OLD" 기존 / "NEW" 신규
  private String rankOldAndNew;

  private String movieCd;

  private String movieNm;

  private String openDt;

  private String salesAmt;

  private String salesShare;

  private String salesInten;

  private String salesChange;

  private String salesAcc;

  private String audiCnt;

  private String audiInten;

  private String audiChange;

  private String audiAcc;

  private String scrnCnt;

  private String showCnt;
}
