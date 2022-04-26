package inno.escape.moviebatch.domain.people.dto.info;

import java.io.Serializable;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class PeopleInfoDto implements Serializable {

    private static final long serialVersionUID = -84096862024754819L;

    private String key;

    private String peopleCd;

    private String peopleNm;

    private String peopleNmEn;

    private String sex;

    private String repRoleNm;

    private List<String> homepages;

    private List<FilmoDto> filmos;

}
