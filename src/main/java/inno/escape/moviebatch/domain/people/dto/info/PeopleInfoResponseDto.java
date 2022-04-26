package inno.escape.moviebatch.domain.people.dto.info;

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
public class PeopleInfoResponseDto implements Serializable {

    private static final long serialVersionUID = 4432316270593532344L;

    private PeopleInfoResultDto peopleInfoResult;
}
