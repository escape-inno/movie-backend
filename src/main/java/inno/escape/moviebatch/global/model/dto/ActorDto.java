package inno.escape.moviebatch.global.model.dto;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class ActorDto implements Serializable {

  private static final long serialVersionUID = -3129364442384658519L;

  private String peopleNm;

  private String peopleNmEn;

  private String cast;

  private String castEn;
}