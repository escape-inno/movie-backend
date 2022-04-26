package inno.escape.moviebatch.domain.people.dto.info;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
