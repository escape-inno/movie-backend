package inno.escape.moviebatch.global.model.dto;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class ShowTypeDto implements Serializable {

  private static final long serialVersionUID = -3550995663216297158L;

  private String showTypeGroupNm;

  private String showTypeNm;
}