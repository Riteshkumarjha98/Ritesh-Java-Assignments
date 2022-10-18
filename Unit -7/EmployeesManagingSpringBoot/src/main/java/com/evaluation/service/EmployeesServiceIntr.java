package com.evaluation.service;

import java.util.List;

import com.evaluation.entities.Employees;
import com.evaluation.exception.EmployeesException;
import com.evaluation.exception.NotFoundException;

public interface EmployeesServiceIntr {

	
	
	public List<Employees> getAllEmployeesDetails() throws NotFoundException;
	
	public Employees deleteEmployees(Integer id)  throws NotFoundException;
          
	public Employees getEmployeesById(Integer id) throws EmployeesException;
    
	Employees updateEmployees(Integer id, Employees Employees) throws NotFoundException;
	
	public Employees deleteAllEmployees() throws NotFoundException;

	Employees createNewEmployees(Employees Employees);

	




	
}