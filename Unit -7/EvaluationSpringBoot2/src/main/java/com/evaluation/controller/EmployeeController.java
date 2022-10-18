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

import com.evaluation.entities.Employee;
import com.evaluation.exception.NotFoundException;
import com.evaluation.exception.EmployeeException;
import com.evaluation.service.EmployeeServiceIntr;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceIntr EmployeeService;
	
	 
	 // Creating Employee
	
	 @PostMapping("/api/Employees")
	 public Employee createNewEmployee(@RequestBody Employee Employee) {
		 
	  return this.EmployeeService.createNewEmployee(Employee);
	  
	 }
	 
	 
	 //Get Employee By Id
	  @GetMapping("/api/Employees/{id}")
	   public Employee getEmployeeHandler(@PathVariable Integer id) throws EmployeeException {
		   return EmployeeService.getEmployeeById(id);
	   }
	 
	 
	 
	 
	
	 // List of Employee
	 
	@GetMapping("/api/Employees")
	public List<Employee> getEmployees() throws NotFoundException{
	   return this.EmployeeService.getAllEmployeeDetails();
	}
	
	
	
   

	 //Updating Employee By Id
	
	@PutMapping(value ="/api/Employees/{id}")
	public ResponseEntity<Employee> updateEmployeeHandler(@PathVariable Integer id, @RequestBody Employee Employee) throws NotFoundException{
		
	  Employee updatedEmployee = EmployeeService.updateEmployee(id, Employee);
		
		return new ResponseEntity<Employee>(updatedEmployee,HttpStatus.ACCEPTED);
		
	}
	 
	 // Deleting Employee By Id
	
	 @DeleteMapping("/api/Employees/{id}")
	 public Employee deleteEmployee(@PathVariable int id) throws NotFoundException {
		 return this.EmployeeService.deleteEmployee(id);
		 
	 }
	 
	 @DeleteMapping("/api/Employees")
	 public Employee deleteEmployee() throws NotFoundException {
		 return this.EmployeeService.deleteAllEmployee();
		 
	 }
	 

}
