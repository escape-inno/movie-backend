package inno.escape.moviebackend.domain.boxoffice.dto;

import java.io.Serializable;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class DailyBoxOfficeResult implements Serializable {

  private String boxofficeType;

  private String showRange;

  private List<BoxOfficeResult> dailyBoxOfficeList;
}
