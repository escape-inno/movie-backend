package inno.escape.moviebatch.domain.boxoffice.dto.daily;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class DailyBoxOfficeResponseDto implements Serializable {

  private static final long serialVersionUID = 5723722838407269807L;

  private DailyBoxOfficeResultDto boxOfficeResult;
}
