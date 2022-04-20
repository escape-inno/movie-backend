package inno.escape.moviebackend.domain.company.dto.list;

import java.io.Serializable;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class CompanyListResult implements Serializable {

  private static final long serialVersionUID = 2668976868106688034L;

  private int totCnt;

  private List<CompanyList> companyList;

  private String source;
}
