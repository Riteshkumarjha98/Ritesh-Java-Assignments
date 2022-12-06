package com.assignment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.assignment.exception.NotFoundException;
import com.assignment.model.Movie;
import com.assignment.repository.MovieRepository;

import com.assignment.exception.MovieException;


@Service
public class MovieServiceImpl implements MovieService{

	 @Autowired
	private MovieRepository MovieRepo;
	 
	 
	 
	 @Override
		public Movie createMovie(Movie Movie) throws NotFoundException {
			// TODO Auto-generated method stub
			return MovieRepo.save(Movie);
		}


	@Override
	public Movie findMovieById(Integer id) throws NotFoundException {
		
	 Optional<Movie> optMovie = MovieRepo.findById(id);
	   if(!optMovie.isPresent())
		   throw new NotFoundException("Movie not Found with id : " + id);
		return optMovie.get();
	}



	@Override
	public Movie getMoviesById(Integer id) throws NotFoundException {
		   Optional<Movie> opt = MovieRepo.findById(id);
			 
		    if(opt.isPresent()) {
		    	return opt.get();
		    }
		    else
		    	
		    	throw new NotFoundException("Movies Doesn't Exist With Id :" + id);
		}


	@Override
	public List<Movie> getAllMoviesDetails() throws NotFoundException {
	    List<Movie>Movies = MovieRepo.findAll();
		
				if(Movies.size()>0)
					return Movies;
				
				else 
					
					throw new NotFoundException("Movies Not Found");
		}



	@Override
	public Movie DeleteMovie(Integer id) throws NotFoundException {
       Movie existingMovie = MovieRepo.findById(id).orElseThrow(() -> new MovieException("Movie Doesn't Exist with Id "+id));
		
     
	MovieRepo.delete(existingMovie);
			
		 return existingMovie;
	}


}
