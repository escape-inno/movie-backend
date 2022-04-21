package inno.escape.moviebatch.domain.movieperson.dto.info;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class MoviePersonInfo implements Serializable {

    private static final long serialVersionUID = -84096862024754819L;

    private String key;

    private String peopleCd;

}
