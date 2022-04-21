package inno.escape.moviebatch.domain.company.dto.info;

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
public class CompanyInfoRequestDto implements Serializable {

  private static final long serialVersionUID = -7795577176322605319L;

  @NotBlank(message = "발급받은 키 값을 입력해주세요.")
  private String key;

  @NotBlank(message = "영화사 코드 번호를 입력해주세요.")
  private String companyCd;
}
