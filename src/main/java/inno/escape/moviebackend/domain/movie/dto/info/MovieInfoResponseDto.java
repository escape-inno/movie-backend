package inno.escape.moviebackend.domain.movie.dto.info;

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
public class MovieInfoResponseDto implements Serializable {

  private static final long serialVersionUID = 1612891044051217289L;

  private MovieInfoResult movieInfoResult;
}
