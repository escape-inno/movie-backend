package inno.escape.moviebackend.domain.company.dto.info;

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
public class CompanyInfo implements Serializable {

  private String companyCd;

  private String companyNm;

  private String companyNmEn;

  private String ceoNm;

  private List<Part> parts;

  private List<Filmo> filmos;
}
