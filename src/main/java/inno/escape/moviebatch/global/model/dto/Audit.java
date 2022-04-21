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
public class Audit implements Serializable {

  private static final long serialVersionUID = -2894116262379544856L;

  private String auditNo;

  private String watchGrandeNm;
}