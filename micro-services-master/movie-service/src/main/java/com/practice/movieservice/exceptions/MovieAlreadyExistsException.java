package com.practice.movieservice.exceptions;

import com.practice.movieservice.domain.Movie;

public class MovieAlreadyExistsException extends Exception{

	Movie movie;
	
	public MovieAlreadyExistsException(Movie movie) {
		this.movie=movie;
	}
	public String toString(){
	     return movie + " already exists" ;
	}
}
