package inno.escape.moviebatch.global.model.dto;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class PartDto implements Serializable {

  private static final long serialVersionUID = -289346248160199690L;

  private String companyPartNm;
}
