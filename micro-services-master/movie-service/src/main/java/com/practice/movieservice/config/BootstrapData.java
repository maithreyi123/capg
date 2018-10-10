package com.practice.movieservice.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.event.ContextRefreshedEvent;

import com.practice.movieservice.domain.Movie;
import com.practice.movieservice.repository.MovieRepository;

@Primary
@Configuration
public class BootstrapData implements ApplicationListener<ContextRefreshedEvent>{
	
	
	private MovieRepository movieRepository;
	
	@Autowired
	public BootstrapData(MovieRepository movieRepository) {
		this.movieRepository=movieRepository;
	}
	
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Movie movie1 = new Movie(1,"Avengers","https://tse4.mm.bing.net/th?id=OIP.Wsn-7Zzy3AFWYgqGX-f4hAHaKQ&pid=15.1&P=0&w=300&h=300","2009");
		movieRepository.save(movie1);
		Movie movie2 = new Movie(2,"Ramleela","https://tse2.mm.bing.net/th?id=OIP.8_Ed0S8v-CQIeMpX6XbLhQHaKk&pid=15.1&P=0&w=300&h=300","2019");
		movieRepository.save(movie2);
		
		
		
	}

}
