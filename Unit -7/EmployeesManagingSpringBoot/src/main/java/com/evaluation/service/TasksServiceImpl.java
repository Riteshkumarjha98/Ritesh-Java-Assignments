package com.evaluation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluation.entities.Tasks;

import com.evaluation.exception.TasksException;

import com.evaluation.exception.NotFoundException;
import com.evaluation.repository.TasksDao;

@Service
public class TasksServiceImpl implements TasksServiceIntr{ 


	@Autowired
	private TasksDao TskDao;  //For Accessing JPA Repository
	

	@Override
	public Tasks createNewTasks(Tasks Tasks) {
		Tasks savedTasks = TskDao.save(Tasks);
		   return savedTasks;
	}
	
	

	@Override
	public List<Tasks> getAllTasksDetails() throws NotFoundException {
		List<Tasks> Taskss = TskDao.findAll();
		
		if(Taskss.size()>0)
			return Taskss;
		else 
			throw new TasksException("Tasks Not Found");
	
		
	}

	@Override
	public Tasks deleteTasks(Integer Id) throws NotFoundException {
		
		Tasks existingTasks= TskDao.findById(Id).orElseThrow(() -> new TasksException("Tasks Doesn't Exist with Id "+Id));
		
		TskDao.delete(existingTasks);
			
		 return existingTasks;
	}

	

	@Override
	public Tasks updateTasks(Integer Id, Tasks Tasks) throws NotFoundException {
	
		
		 Optional<Tasks> foundTasks =  TskDao.findById(Id);
		 if(!foundTasks.isPresent()) throw new NotFoundException("Tasks not found to update with " + Id);
		 
		 Tasks updateTasks = foundTasks.get();
		 
	     
	      updateTasks.setId(Tasks.getId());
		 
		
         
           return TskDao.save(updateTasks);
		 
	}
	

	

	@Override
	public Tasks getTasksById(Integer Id) throws TasksException{
		
	   Optional<Tasks> opt = TskDao.findById(Id);
		 
	    if(opt.isPresent()) {
	    	return opt.get();
	    }else
	    	throw new TasksException("Tasks Doesn't Exist With Id :" + Id);
	}




	
}
