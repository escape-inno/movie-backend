package inno.escape.moviebatch.domain.movieperson.dto.info;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class MoviePersonResponseDto implements Serializable {

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
