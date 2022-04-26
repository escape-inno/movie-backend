package inno.escape.moviebatch.domain.movie.entity;

import inno.escape.moviebatch.global.model.entity.BaseAuditingEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Movie extends BaseAuditingEntity {

    private Company company;
    private String code;
    private String koreaTitle;
    private String englishTitle;
    private String nation;
    private int opened_year;
    private String genre;
    private AGE_LIMIT ageLimit;

}
