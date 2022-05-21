package inno.escape.moviebatch.domain.movie.repository;

import inno.escape.moviebatch.domain.company.entity.Company;
import inno.escape.moviebatch.domain.movie.entity.Movie;
import inno.escape.moviebatch.domain.movie.entity.MovieCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieCompanyRepository extends JpaRepository<MovieCompany, String> {

    MovieCompany findByMovieAndCompany(Movie movie, Company company);
}
