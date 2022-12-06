package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;
import com.masai.model.Manager;
import com.masai.service.EmployeeService;
import com.masai.service.ManagerService;

@RestController
public class EmployeeManagerController {
	
	@Autowired
	private EmployeeService EmpService;
	
	@Autowired
	private ManagerService mangService;
	
	
	@PostMapping(value = "/api/employee")
	public ResponseEntity<Employee> saveEmployeeHandler(@RequestBody Employee employee){
		
	     Employee savedEmployee =EmpService.saveEmployee(employee);
	     return new ResponseEntity<Employee>(savedEmployee,HttpStatus.CREATED);
		
	         }
	
   @GetMapping(value = "/api/get-employees/{employee_id}")
   public ResponseEntity<Employee> getEmployeeDetailsByIdHandler(@PathVariable Integer employee_id){
    Employee foundEmployee =  EmpService.getEmployeeDetailsById(employee_id);
	 return new ResponseEntity<Employee>(foundEmployee,HttpStatus.ACCEPTED);
	   
   }
   
   
   @GetMapping(value = "/api/get-employee-manager/{employee_id}")
   public ResponseEntity<Manager> findMangerWithTheHelpOfEmployeeIdHandler(@PathVariable Integer employee_id){
	   
	    Manager foundManager =  mangService.findMangerWithEmployeeId(employee_id);
	   
	   return new ResponseEntity<Manager>(foundManager,HttpStatus.ACCEPTED);
	   
  
   }
   

}
