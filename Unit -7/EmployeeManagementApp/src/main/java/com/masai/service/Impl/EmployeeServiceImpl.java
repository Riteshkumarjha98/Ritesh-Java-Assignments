package com.masai.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.NotFoundException;
import com.masai.model.Employee;
import com.masai.repository.EmployeeDao;
import com.masai.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{
  
	@Autowired
	private EmployeeDao empDao;
	
	
	@Override
	public Employee saveEmployee(Employee employee) throws NotFoundException {
		// TODO Auto-generated method stub
		return empDao.save(employee);
	}


	@Override
	public Employee getEmployeeDetailsById(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
   Optional<Employee> optEmployee =	empDao.findById(id);
   if(!optEmployee.isPresent())
	   throw new NotFoundException("Employee not found with id : " + id);
		return optEmployee.get();
	}

}
