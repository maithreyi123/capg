package com.practice.movieservice.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.movieservice.domain.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer>{
	
	public Movie getByMovieId(int movieId);
	public List<Movie> getByMovieTitle(String movieTitle);
	public List<Movie> getByMovieYor(String movieYor);
	
	

}
