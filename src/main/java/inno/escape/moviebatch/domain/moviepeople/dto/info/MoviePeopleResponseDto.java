package inno.escape.moviebatch.domain.moviepeople.dto.info;

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
public class MoviePeopleResponseDto implements Serializable {

    private String peopleCd;

    private String peopleNm;

    private String peopleNmEn;

    private String sex;

    private String repRoleNm;

    private String filmos;

    private String movieCd;

    private String movieNm;

    private String moviePartNm;

    private String homepages;
}
