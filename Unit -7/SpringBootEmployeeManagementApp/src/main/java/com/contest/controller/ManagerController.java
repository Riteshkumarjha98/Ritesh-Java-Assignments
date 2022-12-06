package com.contest.controller;

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

import com.contest.exception.NotFoundException;
import com.contest.model.Manager;

import com.contest.services.ManagerService;

@RestController
public class ManagerController {
	
	@Autowired
	private ManagerService ManagerServices;
	
	
	@PostMapping(value = "/Manager")
	public ResponseEntity<com.contest.model.Manager> createManagerHandler(@RequestBody Manager Manager){
		
		Manager createdManager = ManagerServices.createManager(Manager);
		
		return new ResponseEntity<>(createdManager,HttpStatus.CREATED);
	
	}
	
   
	@PutMapping(value ="/Manager/{id}")
	public ResponseEntity<Manager> updateManagerHandler(@PathVariable int id, @RequestBody Manager Manager) throws NotFoundException{
		
	  Manager updatedManager = ManagerServices.updateManager(id, Manager);
		
		return new ResponseEntity<Manager>(updatedManager,HttpStatus.ACCEPTED);
		
	}
	
	
	
	
	
	 // Deleting Manager By Id
	
	 @DeleteMapping("/Manager/{Id}")
	 public Manager CancelManagers(@PathVariable int Id) throws NotFoundException {
		 return this.ManagerServices.CancelManagers(Id);
		 
	 }
	 
		
		@GetMapping("/Manager")
		public List<Manager> getManager() throws NotFoundException{
		   return this.ManagerServices.getAllManagerDetails();
		}
		
	 

}
