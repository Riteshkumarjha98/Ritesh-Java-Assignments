package com.assignment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.exception.NotFoundException;
import com.assignment.exception.CastException;
import com.assignment.model.Cast;
import com.assignment.repository.CastRepository;

@Service
public class CastServiceImpl implements CastService {

	@Autowired
	private CastRepository CastRepo;
	

	@Override
	public Cast createCast(Cast Cast) {
		
		return CastRepo.save(Cast);
		
	}

	@Override
	public Cast updateCast(Integer id, Cast Cast) throws NotFoundException {
		
		Optional<Cast> optCast = CastRepo.findById(id);
		if(!optCast.isPresent())
			throw new NotFoundException("Cast not found with id : " + id);
		
		  Cast updatedCast = optCast.get();
		  
		   updatedCast.setId(Cast.getId());
		   updatedCast.setLeadActor(Cast.getLeadActress());
		   updatedCast.setLeadActress(Cast.getLeadActress());
		   updatedCast.setLeadNegativeRole(Cast.getLeadNegativeRole());
		   updatedCast.setProducer(Cast.getProducer());
		   
		    return Cast;
	}

	@Override
	public Cast deleteCast(Integer id) throws NotFoundException {
	
		Cast existingCasts = CastRepo.findById(id).orElseThrow(() -> new CastException("Cast Doesn't Exist with Id "+id));
		
        CastRepo.delete(existingCasts);
		
	       return existingCasts;
		
	}

	@Override
	public List<Cast> getAllCastDetails() throws NotFoundException {
		   List<Cast>Cast =CastRepo.findAll();
			
			if(Cast.size()>0)
				return Cast;
			else 
				throw new NotFoundException("Cast Not Found");
	}


	
}
