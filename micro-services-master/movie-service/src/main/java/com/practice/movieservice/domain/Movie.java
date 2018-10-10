package com.practice.movieservice.domain;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document
public class Movie {
	
	@Id
	private int movieId;
	private String movieTitle;
	private String moviePoster;
	private String movieYor;
	
	
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Movie(int movieId, String movieTitle, String moviePoster, String movieYor) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.moviePoster = moviePoster;
		this.movieYor = movieYor;
	}


	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	
	public String getMoviePoster() {
		return moviePoster;
	}

	public void setMoviePoster(String moviePoster) {
		this.moviePoster = moviePoster;
	}

	public String getMovieYor() {
		return movieYor;
	}
	public void setMovieYor(String movieYor) {
		this.movieYor = movieYor;
	}

}
