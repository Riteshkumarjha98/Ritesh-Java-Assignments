package com.contest.services;


import java.util.List;


import com.contest.exception.NotFoundException;
import com.contest.model.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee Employee) throws NotFoundException;
	
	public Employee findEmployeeById(Integer id) throws NotFoundException;
	
	public Employee getEmployeesById(Integer id) throws NotFoundException;
	
	public List<Employee> getAllEmployeesDetails() throws NotFoundException;
	
	public Employee CancelEmployee(Integer id)  throws NotFoundException;


	
}
