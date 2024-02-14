package servicios.uno.service;
import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;
import servicios.uno.model.Movie;
import servicios.uno.repository.MovieRepo;

@Service
public class MovieService {

    private final MovieRepo movieRepository;

    public MovieService(MovieRepo movieRepo) {
        this.movieRepository = movieRepo;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        Optional<Movie> optionalMovie = movieRepository.findById(id);
        return optionalMovie.orElse(null);
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie updateMovie(Long id, Movie movie) {
        Optional<Movie> optionalMovie = movieRepository.findById(id);
        if (optionalMovie.isPresent()) {
            movie.setId(id);
            return movieRepository.save(movie);
        } else {
            return null;
        }
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
