package com.contest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contest.exception.NotFoundException;
import com.contest.model.Employee;
import com.contest.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	  private EmployeeService EmployeeService;
	
	@PostMapping(value = "/Employee")
	public ResponseEntity<Employee>  createEmployeeItemHandler(@RequestBody Employee EmployeeItem) throws NotFoundException{
	
		Employee e = EmployeeService.createEmployee(EmployeeItem);
		return new ResponseEntity<Employee>(e,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "Employee/{id}")
	public ResponseEntity<Employee> findEmployeeItemByIdHandler(@PathVariable Integer id) throws NotFoundException{
		
	  Employee foundEmployeeItem =EmployeeService.findEmployeeById(id);
	  return new ResponseEntity<Employee>(foundEmployeeItem,HttpStatus.ACCEPTED);
	}


	 
	
	@GetMapping("/Employee")
	public List<Employee> getEmployeeItems() throws NotFoundException{
	   return this.EmployeeService.getAllEmployeesDetails();
	}
	
	
	 @DeleteMapping(value= "/Employee/{id}")
	 public Employee CancelEmployeeItem(@PathVariable int id) throws NotFoundException {
		
		 return this.EmployeeService.CancelEmployee(id);
		 
		 
	 }
	
}
