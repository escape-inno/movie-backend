package inno.escape.moviebatch.global.model.dto;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class AuditDto implements Serializable {

  private static final long serialVersionUID = -2894116262379544856L;

  private String auditNo;

  private String watchGrandeNm;
}