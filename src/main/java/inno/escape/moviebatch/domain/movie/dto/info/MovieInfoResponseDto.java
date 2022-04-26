package inno.escape.moviebatch.domain.movie.dto.info;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class MovieInfoResponseDto implements Serializable {

  private static final long serialVersionUID = 1612891044051217289L;

  private MovieInfoResult movieInfoResult;
}
