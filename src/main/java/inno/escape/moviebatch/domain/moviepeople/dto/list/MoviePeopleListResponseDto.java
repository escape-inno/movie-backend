package inno.escape.moviebatch.domain.moviepeople.dto.list;

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
public class MoviePeopleListResponseDto implements Serializable {

    private static final long serialVersionUID = 3368883395197321767L;

    private String peopleCd;

    private String peopleNm;

    private String peopleNmEn;

    private String repRoleNm;

    private String filmoNames;

}
