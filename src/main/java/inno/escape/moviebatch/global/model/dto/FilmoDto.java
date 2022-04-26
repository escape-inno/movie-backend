package inno.escape.moviebatch.global.model.dto;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class FilmoDto implements Serializable {

  private static final long serialVersionUID = -4053066014700162783L;

  private String movieCd;

  private String movieNm;

  private String companyPartNm;
}
