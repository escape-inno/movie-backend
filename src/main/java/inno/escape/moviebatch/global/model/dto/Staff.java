package inno.escape.moviebatch.global.model.dto;

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
public class Staff implements Serializable {

  private static final long serialVersionUID = 7111697258327868403L;

  private String peopleNm;

  private String peopleNmEn;

  private String staffRoleNm;
}