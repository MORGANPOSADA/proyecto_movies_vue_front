package servicios.uno.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import servicios.uno.model.Movie;


public interface  MovieRepo extends JpaRepository<Movie,Long> {

}
