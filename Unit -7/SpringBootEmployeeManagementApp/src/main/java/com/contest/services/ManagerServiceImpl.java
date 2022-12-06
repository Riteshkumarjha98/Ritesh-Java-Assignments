package com.contest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.contest.exception.NotFoundException;



import com.contest.exception.ManagerException;
import com.contest.model.Manager;

import com.contest.repository.ManagerRepository;


@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerRepository ManagerRepo;

	@Override
	public Manager createManager(Manager Manager) {
		// TODO Auto-generated method stub
		return ManagerRepo.save(Manager);
	}



	@Override
	public Manager CancelManagers(Integer id) throws NotFoundException {

		Manager existingManager= ManagerRepo.findById(id).orElseThrow(() -> new ManagerException("Managers Doesn't Exist with Id "+id));
		
		ManagerRepo.delete(existingManager);
			
		 return existingManager;
	}
	
	

	@Override
	public List<Manager> getAllManagerDetails() throws NotFoundException {
		
	    List<Manager> Manager = ManagerRepo.findAll();
		
					if(Manager.size()>0)
						return Manager;
					else 
						throw new NotFoundException("Manager Not Found");
			}



	@Override
	public Manager updateManager(Integer id, Manager Manager) throws NotFoundException {
		
		Optional<Manager> optManager = ManagerRepo.findById(id);
		if(!optManager.isPresent())
			throw new NotFoundException("Manager not found with id : " + id);
		
		   Manager updatedManager =   optManager.get();
		  
		   updatedManager.setId(Manager.getId());
   
		   
		   
			
			return Manager;
	}




	

	}



	


