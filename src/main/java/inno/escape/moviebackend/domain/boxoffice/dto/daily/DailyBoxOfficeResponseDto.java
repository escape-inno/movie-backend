package inno.escape.moviebackend.domain.boxoffice.dto.daily;

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
public class DailyBoxOfficeResponseDto implements Serializable {

  private static final long serialVersionUID = 5723722838407269807L;

  private DailyBoxOfficeResult boxOfficeResult;
}
