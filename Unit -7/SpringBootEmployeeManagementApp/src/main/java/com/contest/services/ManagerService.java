package com.contest.services;


import java.util.List;

import com.contest.exception.NotFoundException;

import com.contest.model.Manager;


public interface ManagerService {
   
	public Manager createManager(Manager Manager);
	
	 Manager CancelManagers(Integer id)  throws NotFoundException;
	 
    public List<Manager> getAllManagerDetails() throws NotFoundException;

	Manager updateManager(Integer id, Manager Manager) throws NotFoundException;
}
