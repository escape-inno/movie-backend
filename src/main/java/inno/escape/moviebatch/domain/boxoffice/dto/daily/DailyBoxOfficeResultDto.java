package inno.escape.moviebatch.domain.boxoffice.dto.daily;

import inno.escape.moviebatch.domain.boxoffice.dto.BoxOfficeResultDto;
import java.io.Serializable;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class DailyBoxOfficeResultDto implements Serializable {

  private static final long serialVersionUID = 9003651971396355972L;

  private String boxofficeType;

  private String showRange;

  private List<BoxOfficeResultDto> dailyBoxOfficeList;
}
