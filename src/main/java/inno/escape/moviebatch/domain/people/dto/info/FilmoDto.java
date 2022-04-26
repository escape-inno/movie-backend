package inno.escape.moviebatch.domain.people.dto.info;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class FilmoDto implements Serializable {

    private static final long serialVersionUID = 6852281635082888388L;

    private String movieCd;

    private String movieNm;

    private String moviePartNm;
}
