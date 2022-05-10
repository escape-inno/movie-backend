package inno.escape.moviebatch.domain.movie.entity;

import inno.escape.moviebatch.domain.company.entity.Company;
import inno.escape.moviebatch.domain.people.entity.People;
import inno.escape.moviebatch.global.model.entity.BaseAuditingEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity(name = "movie")
public class Movie extends BaseAuditingEntity {

    @Id
    @Column(name = "id", columnDefinition = "VARCHAR(36)", updatable = false, nullable = false)
    private String id;

    @Column(name = "code")
    private String code;

    @Column(name = "korea_title")
    private String koreaTitle;

    @Column(name = "english_title")
    private String englishTitle;

    @Column(name = "nation")
    private String nation;

    @Column(name = "year")
    private int year;

    @Column(name = "age_limit")
    private String ageLimit; //
}
