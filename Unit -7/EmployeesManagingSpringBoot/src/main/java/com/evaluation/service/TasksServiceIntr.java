package com.evaluation.service;

import java.util.List;

import com.evaluation.entities.Tasks;
import com.evaluation.exception.TasksException;
import com.evaluation.exception.NotFoundException;

public interface TasksServiceIntr {
   
    public Tasks createNewTasks(Tasks Tasks);
	
	public List<Tasks> getAllTasksDetails() throws NotFoundException;
	
	public Tasks deleteTasks(Integer Id)  throws NotFoundException;
          
	public Tasks getTasksById(Integer Id) throws TasksException;
    
	Tasks updateTasks(Integer Id, Tasks Tasks) throws NotFoundException;
	
//	public Tasks deleteAllTasks() throws NotFoundException;

	
}
