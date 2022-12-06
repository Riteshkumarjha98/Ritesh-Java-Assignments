package com.masai.service;

import com.masai.exception.NotFoundException;
import com.masai.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee)throws NotFoundException;
	
	public Employee getEmployeeDetailsById(Integer id) throws NotFoundException;
	
      
}
