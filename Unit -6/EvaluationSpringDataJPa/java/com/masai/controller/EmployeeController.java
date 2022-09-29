package com.masai.controller;

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

import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;

import com.masai.services.EmployeeServices;


@RestController
public class EmployeeController {
	
	@Autowired
  private EmployeeServices EmployeeServices;   

	
   @PostMapping("/Employees")
  public Employee AddEmployeeHandler(@RequestBody Employee Employee) {
	  return EmployeeServices.AddEmployee(Employee);
  }
	
  
   
   @GetMapping("/Employees")
   public ResponseEntity<List<Employee>> getAllEmployeesHandler() throws EmployeeException{
	   
	 List<Employee> Employees =  EmployeeServices.getAllEmployeeDetaisl();
	 return new ResponseEntity<List<Employee>>(Employees,HttpStatus.OK);
	   
   }
   
  
   
	@PutMapping("/Employees")
	public ResponseEntity<Employee> updateEmployeeHandler(@RequestBody Employee Employee) throws EmployeeException {
		
	Employee updatedEmployee = EmployeeServices.updateEmployee(Employee);

		return new ResponseEntity<Employee>(updatedEmployee,HttpStatus.ACCEPTED);

	}
   
   
	@DeleteMapping("Employees/{id}")
	public Employee deleteEmployeeById(@PathVariable("id") Integer id) throws EmployeeException  {
		
		return EmployeeServices.deleteEmployeeById(id);
	}
	
	

}
