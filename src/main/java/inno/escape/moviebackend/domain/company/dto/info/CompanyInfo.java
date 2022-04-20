package inno.escape.moviebackend.domain.company.dto.info;

import inno.escape.moviebackend.global.model.dto.Filmo;
import inno.escape.moviebackend.global.model.dto.Part;
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

  private static final long serialVersionUID = 2418529724200009706L;

  private String companyCd;

  private String companyNm;

  private String companyNmEn;

  private String ceoNm;

  private List<Part> parts;

  private List<Filmo> filmos;
}
