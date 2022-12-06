package com.evaluation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluation.entities.Employees;
import com.evaluation.exception.EmployeesException;
import com.evaluation.exception.NotFoundException;
import com.evaluation.repository.EmployeesDao;



@Service
public class EmployeesServiceImpl implements EmployeesServiceIntr{
	
	@Autowired
	private EmployeesDao EmpDao;  //For Accessing JPA Repository
	

	@Override
	public Employees createNewEmployees(Employees Employees) {
		Employees savedEmployees = EmpDao.save(Employees);
		   return savedEmployees;
	}
	
	

	@Override
	public List<Employees> getAllEmployeesDetails() throws NotFoundException {
		List<Employees> Employeess = EmpDao.findAll();
		
		if(Employeess.size()>0)
			return Employeess;
		else 
			throw new EmployeesException("Employees Not Found");
	
		
	}

	@Override
	public Employees deleteEmployees(Integer id) throws NotFoundException {
		
		Employees existingEmployees= EmpDao.findById(id).orElseThrow(() -> new EmployeesException("Employees Doesn't Exist with Id "+id));
		
		EmpDao.delete(existingEmployees);
			
		 return existingEmployees;
	}

	

	@Override
	public Employees updateEmployees(Integer id, Employees Employees) throws NotFoundException {
	
		
		 Optional<Employees> foundEmployees =  EmpDao.findById(id);
		 if(!foundEmployees.isPresent()) throw new NotFoundException("Employees not found to update with " + id);
		 
		 Employees updateEmployees = foundEmployees.get();
		 
	     
	    
		
//		     updateEmployees.setId(Employees.getId());
			 updateEmployees.setName(Employees.getName());
			 updateEmployees.setEmail(Employees.getEmail());
			 updateEmployees.setState(Employees.getState());
			 updateEmployees.setMobile(Employees.getMobile());
			 updateEmployees.setDesignation(Employees.getDesignation());
		
         
           return EmpDao.save(updateEmployees);
	}
	

	

	@Override
	public Employees getEmployeesById(Integer id) throws EmployeesException{
		
	   Optional<Employees> opt = EmpDao.findById(id);
		 
	    if(opt.isPresent()) {
	    	return opt.get();
	    }else
	    	throw new EmployeesException("Employees Doesn't Exist With Id :" + id);
	}



	


	@Override
	public Employees deleteAllEmployees() throws NotFoundException {
		return null;
//		Employees deleteAllEmployees = TrDao.deleteAll();
//		   return deleteAllEmployees;
		
	}





	
}
