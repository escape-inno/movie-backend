package inno.escape.moviebatch.domain.movie.dto.moviecompany;

import inno.escape.moviebatch.domain.movie.dto.list.MovieListResult;
import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class MovieCompanyResponseDto implements Serializable {

  private static final long serialVersionUID = 2471969064580034828L;

  private MovieListResult movieListResult;
}
