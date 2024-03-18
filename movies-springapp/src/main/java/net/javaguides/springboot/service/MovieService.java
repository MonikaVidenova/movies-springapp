package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.Movie;

public interface MovieService {
	List<Movie> getAllMovies();
	void saveMovie(Movie movie);
	Movie getMovieById(long id);
	void deleteMovieById(long id);
	Page<Movie> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
