package com.assignment.services;

import java.util.List;

import com.assignment.exception.NotFoundException;
import com.assignment.model.Theatres;

public interface TheatresService {


	public Theatres createTheatres(Theatres Theatres);
	
	public Theatres updateTheatres(Integer id,Theatres Theatres) throws NotFoundException;
	
	public Theatres deleteTheatres(Integer id)  throws NotFoundException;
	
	public List<Theatres> getAllTheatresDetails() throws NotFoundException;
	
	
}
