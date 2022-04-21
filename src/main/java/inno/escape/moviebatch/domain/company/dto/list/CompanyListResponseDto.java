package inno.escape.moviebatch.domain.company.dto.list;

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
public class CompanyListResponseDto implements Serializable {

  private static final long serialVersionUID = -160995329994552262L;

  private CompanyListResult companyListResult;
}
