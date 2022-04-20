package inno.escape.moviebackend.domain.company.dto.list;

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
public class CompanyList implements Serializable {

  private String companyCd;

  private String companyNm;

  private String companyNmEn;

  private String companyPartNames;

  private String ceoNm;

  private String filmoNames;
}
