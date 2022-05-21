package inno.escape.moviebatch.domain.people.dto.list;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class PeopleListDto implements Serializable {

  private static final long serialVersionUID = -84096862024754819L;

  private String peopleCd;

  private String peopleNm;

  private String peopleNmEn;

  private String repRoleNm;

    private String filmoNames;

}
