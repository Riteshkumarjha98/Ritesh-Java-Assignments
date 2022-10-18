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

import com.contest.entities.Employees;
import com.contest.exception.NotFoundException;
import com.contest.service.EmployeesServiceIntr;
import com.contest.exception.EmployeeException;


@RestController
public class EmployeesController {

	@Autowired
	EmployeesServiceIntr Employeeservice;
	
	 
	 // Creating Employees
	  @PostMapping("/Employee")
	 public Employees createNewEmployees(@RequestBody Employees Employees) {
		 
	  return this.Employeeservice.createNewEmployees(Employees);
	  
	 }
	 
	 
	 //Get Employees By Id
	  @GetMapping("/Employee/{id}")
	   public Employees getEmployeesHandler(@PathVariable Integer id) throws EmployeeException {
		   return Employeeservice.getEmployeesById(id);
	   }
	 
	 
	 
	 
	
	 // List of Employees
	 
	@GetMapping("/Employees")
	public List<Employees> getEmployees() throws NotFoundException{
	   return this.Employeeservice.getAllEmployeesDetails();
	}
	
	

    //Updating Employees By Id
	
	@PutMapping(value ="/Employee/{id}")
	public ResponseEntity<Employees> updateEmployeesHandler(@PathVariable Integer id, @RequestBody Employees Employees) throws NotFoundException{
		
	  Employees updatedEmployees = Employeeservice.updateEmployees(id, Employees);
		
		return new ResponseEntity<Employees>(updatedEmployees,HttpStatus.ACCEPTED);
		
	}
	 
	 // Deleting Employees By Id
	
	 @DeleteMapping("/Employees/{id}")
	 public Employees deleteEmployees(@PathVariable int id) throws NotFoundException {
		 return this.Employeeservice.deleteEmployees(id);
		 
	 }
	 
	
	
}
