package inno.escape.moviebatch.global.model.dto;

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
public class Company implements Serializable {

  private static final long serialVersionUID = -5244357870496464861L;

  private String companyCd;

  private String companyNm;

  private String companyNmEn;

  private String companyPartNm;
}