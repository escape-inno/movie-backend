package inno.escape.moviebatch.domain.people.dto.list;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class PeopleListResult implements Serializable {

    private static final long serialVersionUID = 3393125919202873051L;

    private int totCnt;

    private List<PeopleList> peopleList;

    private String source;
}
