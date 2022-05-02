package inno.escape.moviebatch.domain.movie.repository;

import inno.escape.moviebatch.domain.movie.entity.Filmo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmoRepository extends JpaRepository<Filmo, String> {

}
