package inno.escape.moviebatch.domain.company.dto.info;

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
public class CompanyInfoResult implements Serializable {

  private static final long serialVersionUID = 8136466563790787613L;

  private CompanyInfo companyInfo;

  private String source;
}
