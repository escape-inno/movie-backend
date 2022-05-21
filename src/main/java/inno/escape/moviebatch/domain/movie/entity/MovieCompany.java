package inno.escape.moviebatch.domain.movie.entity;

import inno.escape.moviebatch.domain.company.entity.Company;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity(name = "movie_company")
public class MovieCompany {

    @Id
    @Column(name = "id", columnDefinition = "VARCHAR(36)", updatable = false, nullable = false)
    private String id;

    @OneToOne
    @JoinColumn(name = "movie_code")
    private Movie movie;

    @OneToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
