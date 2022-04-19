package inno.escape.moviebackend.domain.boxoffice.dto;

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

  private WeeklyBoxOfficeResult boxOfficeResult;
}
