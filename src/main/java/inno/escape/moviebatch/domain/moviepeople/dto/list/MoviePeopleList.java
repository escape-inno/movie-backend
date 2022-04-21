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
public class MoviePeopleList implements Serializable {

    private static final long serialVersionUID = -84096862024754819L;

    private String peopleCd;

    private String peopleNm;

    private String peopleNmEn;

    private String repRoleNm;

    private String filmoNames;

}
