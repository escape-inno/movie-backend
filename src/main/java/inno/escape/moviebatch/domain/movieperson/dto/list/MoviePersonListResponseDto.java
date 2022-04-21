package inno.escape.moviebatch.domain.movieperson.dto.list;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class MoviePersonListResponseDto implements Serializable {

    private static final long serialVersionUID = 3368883395197321767L;

    private String peopleCd;

    private String peopleNm;

    private String peopleNmEn;

    private String repRoleNm;

    private String filmoNames;

}
