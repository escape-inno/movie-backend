package inno.escape.moviebatch.domain.people.dto.list;

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
public class PeopleListResponseDto implements Serializable {

    private static final long serialVersionUID = -878314240138081295L;

    private PeopleListResult peopleListResult;

}
