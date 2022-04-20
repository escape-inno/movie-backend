package inno.escape.moviebackend.domain.movie.dto.list;

import inno.escape.moviebackend.global.model.dto.Company;
import inno.escape.moviebackend.global.model.dto.Director;
import java.io.Serializable;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class MovieList implements Serializable {

  private String movieCd;

  private String movieNm;

  private String movieNmEn;

  private String prdtYear;

  private String openDt;

  private String typeNm;

  private String prdtStatNm;

  private String nationAlt;

  private String genreAlt;

  private String repNationNm;

  private String repGenreNm;

  private List<Director> directors;

  private List<Company> companys;
}

