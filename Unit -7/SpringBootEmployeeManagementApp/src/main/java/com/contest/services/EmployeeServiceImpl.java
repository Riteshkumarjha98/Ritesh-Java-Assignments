package com.contest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.contest.exception.NotFoundException;
import com.contest.model.Employee;
import com.contest.repository.EmployeeRepository;
import com.contest.exception.EmployeeException;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	 @Autowired
	private EmployeeRepository EmployeeRepo;
	 
	 
	@Override
	public Employee createEmployee(Employee Employee) throws NotFoundException {
		// TODO Auto-generated method stub
		return EmployeeRepo.save(Employee);
	}


	@Override
	public Employee findEmployeeById(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		
	   Optional<Employee> optEmployee =	EmployeeRepo.findById(id);
	   if(!optEmployee.isPresent())
		   throw new NotFoundException("Employee not Found with id : " + id);
		    return optEmployee.get();
	}


	@Override
	public Employee getEmployeesById(Integer id) throws NotFoundException {
		   Optional<Employee> opt = EmployeeRepo.findById(id);
			 
		    if(opt.isPresent()) {
		    	return opt.get();
		    }
		    else
		    	
		    	throw new NotFoundException("Employees Doesn't Exist With Id :" + id);
		}


	@Override
	public List<Employee> getAllEmployeesDetails() throws NotFoundException {
	    List<Employee> Employees = EmployeeRepo.findAll();
		
				if(Employees.size()>0)
					return Employees;
				
				else 
					
					throw new NotFoundException("Employees Not Found");
		}


	@Override
	public Employee CancelEmployee(Integer id) throws NotFoundException {
       Employee existingEmployee = EmployeeRepo.findById(id).orElseThrow(() -> new EmployeeException("Employee Doesn't Exist with Id "+id));
		
     
	EmployeeRepo.delete(existingEmployee);
			
		 return existingEmployee;
	}


	

}
