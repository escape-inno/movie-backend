package inno.escape.moviebatch.domain.company.dto.info;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class CompanyInfoResult implements Serializable {

  private static final long serialVersionUID = 8136466563790787613L;

  private CompanyInfoDto companyInfo;

  private String source;
}
