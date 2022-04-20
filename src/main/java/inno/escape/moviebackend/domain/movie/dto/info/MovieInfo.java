package inno.escape.moviebackend.domain.movie.dto.info;

import inno.escape.moviebackend.global.model.dto.Actor;
import inno.escape.moviebackend.global.model.dto.Audit;
import inno.escape.moviebackend.global.model.dto.Company;
import inno.escape.moviebackend.global.model.dto.Director;
import inno.escape.moviebackend.global.model.dto.Genre;
import inno.escape.moviebackend.global.model.dto.Nation;
import inno.escape.moviebackend.global.model.dto.ShowType;
import inno.escape.moviebackend.global.model.dto.Staff;
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
public class MovieInfo implements Serializable {

  private static final long serialVersionUID = 4433653561052442967L;

  private String movieCd;

  private String movieNm;

  private String movieNmEn;

  private String movieNmOg;

  private String showTm;

  private String prdtYear;

  private String openDt;

  private String prdtStatNm;

  private String typeNm;

  private List<Nation> nations;

  private List<Genre> genres;

  private List<Director> directors;

  private List<Actor> actors;

  private List<ShowType> showTypes;

  private List<Company> companys;

  private List<Audit> audits;

  private List<Staff> staffs;
}
