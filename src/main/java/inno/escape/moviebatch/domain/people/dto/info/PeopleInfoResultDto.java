package inno.escape.moviebatch.domain.people.dto.info;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class PeopleInfoResultDto implements Serializable {

    private static final long serialVersionUID = -4434178124999492606L;

    private String source;

    private PeopleInfoDto peopleInfo;

}
