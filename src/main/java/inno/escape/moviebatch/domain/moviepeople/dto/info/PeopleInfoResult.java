package inno.escape.moviebatch.domain.moviepeople.dto.info;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class PeopleInfoResult implements Serializable {

    private static final long serialVersionUID = -4434178124999492606L;

    private String source;

    private PeopleInfo peopleInfo;

}
