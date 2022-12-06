package com.assignment.services;


import java.util.List;


import com.assignment.exception.NotFoundException;
import com.assignment.model.Movie;

public interface MovieService {

	public Movie createMovie(Movie Movie) throws NotFoundException;
	
	public Movie findMovieById(Integer id) throws NotFoundException;
	
	public Movie getMoviesById(Integer id) throws NotFoundException;
	
	public List<Movie> getAllMoviesDetails() throws NotFoundException;
	
	public Movie DeleteMovie(Integer id)  throws NotFoundException;

//	public List<Movie> findByEMAIL(String Movie_email);
//
//	public Movie findByMovienamePassword(String Moviename, String password);
//
//	public void save(Movie Movie);
	
}
