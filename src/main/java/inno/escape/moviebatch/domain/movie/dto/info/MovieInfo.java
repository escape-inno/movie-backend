package inno.escape.moviebatch.domain.movie.dto.info;

import inno.escape.moviebatch.global.model.dto.ActorDto;
import inno.escape.moviebatch.global.model.dto.AuditDto;
import inno.escape.moviebatch.global.model.dto.CompanyDto;
import inno.escape.moviebatch.global.model.dto.DirectorDto;
import inno.escape.moviebatch.global.model.dto.GenreDto;
import inno.escape.moviebatch.global.model.dto.NationDto;
import inno.escape.moviebatch.global.model.dto.ShowTypeDto;
import inno.escape.moviebatch.global.model.dto.StaffDto;
import java.io.Serializable;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

  private List<NationDto> nations;

  private List<GenreDto> genres;

  private List<DirectorDto> directors;

  private List<ActorDto> actors;

  private List<ShowTypeDto> showTypes;

  private List<CompanyDto> companys;

  private List<AuditDto> audits;

  private List<StaffDto> staffs;
}
