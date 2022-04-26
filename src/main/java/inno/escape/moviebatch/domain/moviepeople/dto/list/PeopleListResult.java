package inno.escape.moviebatch.domain.moviepeople.dto.list;

import java.io.Serializable;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class PeopleListResult implements Serializable {

    private static final long serialVersionUID = 3393125919202873051L;

    private int totCnt;

    private List<PeopleList> peopleList;

    private String source;
}
