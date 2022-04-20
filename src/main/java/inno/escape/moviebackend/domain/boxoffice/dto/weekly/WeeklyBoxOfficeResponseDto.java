package inno.escape.moviebackend.domain.boxoffice.dto.weekly;

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
public class WeeklyBoxOfficeResponseDto implements Serializable {

  private static final long serialVersionUID = 9178142528868970022L;

  private WeeklyBoxOfficeResult boxOfficeResult;
}
