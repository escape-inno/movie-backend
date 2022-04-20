package inno.escape.moviebackend.domain.company.dto.list;

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
public class CompanyListRequestDto implements Serializable {

  private static final long serialVersionUID = -363489661227034389L;

  @NotBlank(message = "발급받은 키 값을 입력해주세요.")
  private String key;

  // default 1
  private String curPage;

  // default 10
  private String itemPerPage;

  private String companyNm;

  private String ceoNm;

  // default 전체
  // 공통코드 조회 서비스에서 "2601" 로서 조회된 코드 => 260101 제작사 ~ 260143 미디어센터 + 260199 기타
  private String companyPartCd;
}
