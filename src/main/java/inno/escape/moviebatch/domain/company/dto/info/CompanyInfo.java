package inno.escape.moviebatch.domain.company.dto.info;

import inno.escape.moviebatch.global.model.dto.FilmoDto;
import inno.escape.moviebatch.global.model.dto.PartDto;
import java.io.Serializable;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class CompanyInfo implements Serializable {

  private static final long serialVersionUID = 2418529724200009706L;

  private String companyCd;

  private String companyNm;

  private String companyNmEn;

  private String ceoNm;

  private List<PartDto> parts;

  private List<FilmoDto> filmos;
}
