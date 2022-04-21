package inno.escape.moviebatch.domain.movieperson.dto.list;

import lombok.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class MoviePersonListRequestDto implements Serializable {

    private static final long serialVersionUID = -1981516704041624202L;

    @NotBlank(message = "발급받은키 값을 입력합니다.")
    private String key;

    @NotBlank(message = "현재 페이지를 지정합니다.(default : “1”)")
    private String curPage;

    @NotBlank(message = "결과 ROW 의 개수를 지정합니다.(default : “10”)")
    private String itemPerPage;

    @NotBlank(message = "영화인명으로 조회합니다.")
    private String peopleNm;

    @NotBlank(message = "필모리스트로 조회합니다.")
    private String filmoNames;

}
