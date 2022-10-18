package com.evaluation.service;

import java.util.List;

import com.evaluation.entities.Employee;
import com.evaluation.exception.EmployeeException;
import com.evaluation.exception.NotFoundException;

public interface EmployeeServiceIntr {

	public Employee createNewEmployee(Employee Employee);
	
	public List<Employee> getAllEmployeeDetails() throws NotFoundException;
	
	public Employee deleteEmployee(Integer id)  throws NotFoundException;
          
	public Employee getEmployeeById(Integer id) throws EmployeeException;
    
	Employee updateEmployee(Integer id, Employee Employee) throws NotFoundException;
	
	public Employee deleteAllEmployee() throws NotFoundException;

	




	
}