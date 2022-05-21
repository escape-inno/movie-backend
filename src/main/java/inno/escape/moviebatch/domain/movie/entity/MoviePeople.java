package inno.escape.moviebatch.domain.movie.entity;

import inno.escape.moviebatch.domain.people.entity.People;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity(name = "movie_people")
public class MoviePeople {

    @Id
    @Column(name = "id", columnDefinition = "VARCHAR(36)", updatable = false, nullable = false)
    private String id;

    @OneToOne
    @JoinColumn(name = "movie_code")
    private Movie movie;

    @OneToOne
    @JoinColumn(name = "people_code")
    private People people;

}
