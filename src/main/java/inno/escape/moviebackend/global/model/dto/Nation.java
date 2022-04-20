package inno.escape.moviebackend.global.model.dto;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class Nation implements Serializable {

  private static final long serialVersionUID = -4061994493958405357L;

  private String nationNm;

  private String nationNmEn;
}