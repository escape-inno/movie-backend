package inno.escape.moviebatch.domain.movie.dto.list;

import java.io.Serializable;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class MovieListResult implements Serializable {

  private static final long serialVersionUID = 632577278072469174L;

  private int totCnt;

  private String source;

  private List<MovieList> movieList;
}
