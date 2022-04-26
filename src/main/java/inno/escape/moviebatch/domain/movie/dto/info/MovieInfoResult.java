package inno.escape.moviebatch.domain.movie.dto.info;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class MovieInfoResult implements Serializable {

  private static final long serialVersionUID = -78425244704097601L;

  private MovieInfo movieInfo;

  private String source;
}
