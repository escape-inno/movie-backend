package inno.escape.moviebackend.domain.company.dto.info;

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
public class CompanyInfoResponseDto implements Serializable {

  private static final long serialVersionUID = -4965371073817538095L;

  private CompanyInfoResult companyInfoResult;
}
