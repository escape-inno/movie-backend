package inno.escape.moviebatch.domain.movieperson.dto.list;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class MoviePersonList implements Serializable {

    private static final long serialVersionUID = -84096862024754819L;

    private String peopleCd;

    private String peopleNm;

    private String peopleNmEn;

    private String repRoleNm;

    private String filmoNames;

}
