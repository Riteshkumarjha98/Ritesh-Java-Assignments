package com.assignment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.exception.NotFoundException;
import com.assignment.exception.TheatresException;
import com.assignment.model.Theatres;

import com.assignment.repository.TheatresRepository;




@Service
public class TheatresServiceImpl implements TheatresService{

	@Autowired
	private TheatresRepository TheatresRepo;
	
	
	
	
	@Override
	public Theatres createTheatres(Theatres Theatres) {
		// TODO Auto-generated method stub
		return TheatresRepo.save(Theatres);
	}

	@Override
	public Theatres updateTheatres(Integer id, Theatres Theatres) throws NotFoundException {
		
		Optional<Theatres> optTheatres = TheatresRepo.findById(id);
		if(!optTheatres.isPresent())
			throw new NotFoundException("Theatres not found with id : " + id);
		
		  Theatres updatedTheatres = optTheatres.get();
		  
		   updatedTheatres.setId(Theatres.getId());
		   updatedTheatres.setName(Theatres.getName());
		   updatedTheatres.setAddress(Theatres.getAddress());
		   updatedTheatres.setCity(Theatres.getCity());
		   updatedTheatres.setPin(Theatres.getPin());
		   
		  
		  
		  return Theatres;
	}

	@Override
	public Theatres deleteTheatres(Integer id) throws NotFoundException {
	
		Theatres existingTheatress = TheatresRepo.findById(id).orElseThrow(() -> new TheatresException("Theatres Doesn't Exist with Id "+id));
		
        TheatresRepo.delete(existingTheatress);
		
	       return existingTheatress;
		
	}

	@Override
	public List<Theatres> getAllTheatresDetails() throws NotFoundException {
		   List<Theatres>Theatres =TheatresRepo.findAll();
			
			if(Theatres.size()>0)
				return Theatres;
			else 
				throw new NotFoundException("Theatres Not Found");
	}


	

}
