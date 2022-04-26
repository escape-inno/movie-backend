package inno.escape.moviebatch.global.model.dto;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class NationDto implements Serializable {

  private static final long serialVersionUID = -4061994493958405357L;

  private String nationNm;

  private String nationNmEn;
}