package inno.escape.moviebatch.global.model.dto;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class GenreDto implements Serializable {

  private static final long serialVersionUID = -8848202206185624551L;

  private String genreNm;

  private String genreNmEn;
}