package inno.escape.moviebatch.domain.people.dto.info;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class PeopleInfoRequestDto implements Serializable {

    private static final long serialVersionUID = 1070228269373648498L;
    @NotBlank(message = "발급받은 키 값을 입력해주세요.")
    private String key;

    @NotBlank(message = "영화인코드를 지정합니다.")
    private String peopleCd;
}
