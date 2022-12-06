package com.assignment.services;

import java.util.List;

import com.assignment.exception.NotFoundException;
import com.assignment.model.Cast;

public interface CastService {

	public Cast createCast(Cast Cast);
	
	public Cast updateCast(Integer id,Cast Cast) throws NotFoundException;
	
	public Cast deleteCast(Integer id)  throws NotFoundException;
	
	public List<Cast> getAllCastDetails() throws NotFoundException;
}
