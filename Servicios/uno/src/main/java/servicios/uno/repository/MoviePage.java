package servicios.uno.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import servicios.uno.model.Movie;

public interface  MoviePage extends PagingAndSortingRepository<Movie,Long> {

}