package inno.escape.moviebatch.domain.movie.dto.list;

import inno.escape.moviebatch.global.model.dto.CompanyDto;
import inno.escape.moviebatch.global.model.dto.DirectorDto;
import java.io.Serializable;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class MovieList implements Serializable {

  private static final long serialVersionUID = 5658105501986448664L;

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

  private List<DirectorDto> directors;

  private List<CompanyDto> companys;
}

