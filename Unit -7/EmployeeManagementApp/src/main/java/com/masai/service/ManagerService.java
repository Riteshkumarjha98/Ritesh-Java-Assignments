package com.masai.service;

import com.masai.exception.NotFoundException;
import com.masai.model.Manager;

public interface ManagerService {
	
	public Manager saveManger(Manager manager) throws NotFoundException;
	
	public Manager findMangerWithEmployeeId(Integer id) throws NotFoundException;

}
