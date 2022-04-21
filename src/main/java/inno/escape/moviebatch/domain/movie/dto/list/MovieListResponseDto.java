package inno.escape.moviebatch.domain.movie.dto.list;

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
public class MovieListResponseDto implements Serializable {

  private static final long serialVersionUID = 2471969064580034828L;

  private MovieListResult movieListResult;
}
