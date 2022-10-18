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

import com.evaluation.entities.Employees;
import com.evaluation.exception.NotFoundException;
import com.evaluation.exception.EmployeesException;
import com.evaluation.service.EmployeesServiceIntr;

@RestController
public class EmployeesController {

	@Autowired
	EmployeesServiceIntr EmployeeService;
	
	 
	 // Creating Employee
	
	 @PostMapping("/Employee")
	 public Employees createNewEmployee(@RequestBody Employees Employee) {
		 
	  return this.EmployeeService.createNewEmployees(Employee);
	  
	 }
	 
	 
	 //Get Employee By Id
	  @GetMapping("/Employees/{id}")
	   public Employees getEmployeeHandler(@PathVariable Integer id) throws EmployeesException {
		   return EmployeeService.getEmployeesById(id);
	   }
	 
	 
	 
	 
	
	 // List of Employee
	 
	@GetMapping("/Employee")
	public List<Employees> getEmployees() throws NotFoundException{
	   return this.EmployeeService.getAllEmployeesDetails();
	}
	
	
	
  

	 //Updating Employee By Id
	
	@PutMapping(value ="/Employee/{id}")
	public ResponseEntity<Employees> updateEmployeeHandler(@PathVariable Integer id, @RequestBody Employees Employee) throws NotFoundException{
		
	  Employees updatedEmployee = EmployeeService.updateEmployees(id, Employee);
		
		return new ResponseEntity<Employees>(updatedEmployee,HttpStatus.ACCEPTED);
		
	}
	 
	 // Deleting Employee By Id
	
	 @DeleteMapping("/Employee/{id}")
	 public Employees deleteEmployee(@PathVariable int id) throws NotFoundException {
		 return this.EmployeeService.deleteEmployees(id);
		 
	 }
	 
	 @DeleteMapping("/Employee")
	 public Employees deleteEmployee() throws NotFoundException {
		 return this.EmployeeService.deleteAllEmployees();
		 
	 }
	 

}
