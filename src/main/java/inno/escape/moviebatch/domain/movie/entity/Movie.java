package inno.escape.moviebatch.domain.movie.entity;

import inno.escape.moviebatch.domain.company.entity.Company;
import inno.escape.moviebatch.domain.people.entity.People;
import inno.escape.moviebatch.global.model.entity.BaseAuditingEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity(name = "movie")
public class Movie extends BaseAuditingEntity {

    @OneToOne
    @JoinColumn(name = "director_id")
    private People people;

    @Column(name = "company_id")
    private String companyId;

    @OneToOne
    @JoinColumn(name = "company_id")
    private Company company;

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

    @Column(name = "genre")
    private String genre;

    @Column(name = "motion_picture_rating_system")
    private String motionPictureRatingSystem;
}
