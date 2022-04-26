package inno.escape.moviebatch.domain.movie.entity;

import inno.escape.moviebatch.domain.people.entity.People;
import inno.escape.moviebatch.global.model.entity.BaseAuditingEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Filmo extends BaseAuditingEntity {

    @ManyToOne
    @JoinColumn(name = "people_id")
    private People people;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
}
