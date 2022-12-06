package com.evaluation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.entities.Tasks;
import com.evaluation.exception.TasksException;
import com.evaluation.exception.NotFoundException;
import com.evaluation.service.TasksServiceIntr;

@RestController
public class TasksController {

	@Autowired
	TasksServiceIntr TasksService;
	
	 
	 // Creating Tasks
	
	 @PostMapping("/Task")
	 public Tasks createNewTasks(@RequestBody Tasks Tasks) {
		 
	  return this.TasksService.createNewTasks(Tasks);
	  
	 }
	 
	 
	 //Get Tasks By Id
	  @GetMapping("/api/Task/{Id}")
	   public Tasks getTasksHandler(@PathVariable Integer Id) throws TasksException {
		   return TasksService.getTasksById(Id);
	   }
	 
	 
	 
	 
	
	 // List of Tasks
	 
	@GetMapping("/Task")
	public List<Tasks> getTasks() throws NotFoundException{
	   return this.TasksService.getAllTasksDetails();
	}
	
	
	
   

	 //Updating Tasks By Id
	
	@PutMapping(value ="/Task/{Id}")
	public ResponseEntity<Tasks> updateTasksHandler(@PathVariable Integer Id, @RequestBody Tasks Tasks) throws NotFoundException{
		
	  Tasks updatedTasks = TasksService.updateTasks(Id, Tasks);
		
		return new ResponseEntity<Tasks>(updatedTasks,HttpStatus.ACCEPTED);
		
	}
	 
	 // Deleting Tasks By Id
	
	 @DeleteMapping("/Task/{Id}")
	 public Tasks deleteTasks(@PathVariable int Id) throws NotFoundException {
		 return this.TasksService.deleteTasks(Id);
		 
	 }
	 

	
}

