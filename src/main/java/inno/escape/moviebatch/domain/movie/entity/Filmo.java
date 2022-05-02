package inno.escape.moviebatch.domain.movie.entity;

import inno.escape.moviebatch.global.model.entity.BaseAuditingEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity(name = "filmo")
public class Filmo extends BaseAuditingEntity {

    @OneToMany
    @JoinColumn(name = "movie_id")
    private List<Movie> movie;
}
