package inno.escape.moviebatch.domain.company.dto.list;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class CompanyListDto implements Serializable {

  private static final long serialVersionUID = 6836139051456473878L;

  private String companyCd;

  private String companyNm;

  private String companyNmEn;

  private String companyPartNames;

  private String ceoNm;

  private String filmoNames;
}
