package inno.escape.moviebatch.domain.moviepeople.dto.info;

import java.io.Serializable;
import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class PeopleInfo implements Serializable {

    private static final long serialVersionUID = -84096862024754819L;

    private String key;

    private String peopleCd;

    private String peopleNm;

    private String peopleNmEn;

    private String sex;

    private String repRoleNm;

    private List<String> homepages;

    private List<Filmo> filmos;

}
