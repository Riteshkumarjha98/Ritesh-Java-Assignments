package com.evaluation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluation.entities.Employee;
import com.evaluation.exception.EmployeeException;
import com.evaluation.exception.NotFoundException;
import com.evaluation.repository.EmployeeDao;


@Service
public class EmployeeServiceImpl implements EmployeeServiceIntr{
	
	@Autowired
	private EmployeeDao EmpDao;  //For Accessing JPA Repository
	

	@Override
	public Employee createNewEmployee(Employee Employee) {
		Employee savedEmployee = EmpDao.save(Employee);
		   return savedEmployee;
	}
	
	

	@Override
	public List<Employee> getAllEmployeeDetails() throws NotFoundException {
		List<Employee> Employees = EmpDao.findAll();
		
		if(Employees.size()>0)
			return Employees;
		else 
			throw new EmployeeException("Employee Not Found");
	
		
	}

	@Override
	public Employee deleteEmployee(Integer id) throws NotFoundException {
		
		Employee existingEmployee= EmpDao.findById(id).orElseThrow(() -> new EmployeeException("Employee Doesn't Exist with Id "+id));
		
		EmpDao.delete(existingEmployee);
			
		 return existingEmployee;
	}

	

	@Override
	public Employee updateEmployee(Integer id, Employee Employee) throws NotFoundException {
	
		
		 Optional<Employee> foundEmployee =  EmpDao.findById(id);
		 if(!foundEmployee.isPresent()) throw new NotFoundException("Employee not found to update with " + id);
		 
		 Employee updateEmployee = foundEmployee.get();
		 
	     
	    
		
		 updateEmployee.setId(Employee.getId());
		 updateEmployee.setFirstName(Employee.getFirstName());
		 updateEmployee.setLastName(Employee.getLastName());
		 updateEmployee.setCellPhone(Employee.getCellPhone());
		 updateEmployee.setAddress_id(Employee.getAddress_id());
		
         
           return EmpDao.save(updateEmployee);
	}
	

	

	@Override
	public Employee getEmployeeById(Integer id) throws EmployeeException{
		
	   Optional<Employee> opt = EmpDao.findById(id);
		 
	    if(opt.isPresent()) {
	    	return opt.get();
	    }else
	    	throw new EmployeeException("Employee Doesn't Exist With Id :" + id);
	}



	


	@Override
	public Employee deleteAllEmployee() throws NotFoundException {
		return null;
//		Employee deleteAllEmployee = TrDao.deleteAll();
//		   return deleteAllEmployee;
		
	}





	
}
