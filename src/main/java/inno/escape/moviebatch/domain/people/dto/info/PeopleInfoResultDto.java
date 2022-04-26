package inno.escape.moviebatch.domain.people.dto.info;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class PeopleInfoResultDto implements Serializable {

    private static final long serialVersionUID = -4434178124999492606L;

    private String source;

    private PeopleInfoDto peopleInfo;

}
