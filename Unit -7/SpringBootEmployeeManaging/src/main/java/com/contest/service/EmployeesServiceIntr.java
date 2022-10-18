package com.contest.service;

import java.util.List;

import com.contest.entities.Employees;
import com.contest.exception.NotFoundException;
import com.contest.exception.EmployeeException;

public interface EmployeesServiceIntr {

	public Employees createNewEmployees(Employees Employees);
	
	public List<Employees> getAllEmployeesDetails() throws NotFoundException;
	
	public Employees deleteEmployees(Integer id)  throws NotFoundException;
          
	public Employees getEmployeesById(Integer id) throws EmployeeException;
    
	Employees updateEmployees(Integer id, Employees Employees) throws NotFoundException;
	
	//public Employees deleteAllEmployees() throws NotFoundException;

	




	
}