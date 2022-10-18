package com.contest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contest.entities.Employees;
import com.contest.exception.NotFoundException;
import com.contest.exception.EmployeeException;
import com.contest.repository.EmployeesDao;



@Service
public class EmployeesServiceImpl implements EmployeesServiceIntr{
	
	@Autowired
	private EmployeesDao EmpDao;  //For Accessing JPA Repository
	

	@Override
	public Employees createNewEmployees (Employees Employees ) {
		Employees savedEmployees  = EmpDao.save(Employees );
		   return savedEmployees ;
	}
	
	
	
	@Override
	public List<Employees> getAllEmployeesDetails() throws NotFoundException {
	    List<Employees> Employees = EmpDao.findAll();
		
			if(Employees.size()>0)
				return Employees;
			else 
				throw new EmployeeException("Employees Not Found");
	}




	@Override
	public Employees deleteEmployees (Integer id) throws NotFoundException {
		
		Employees existingEmployees = EmpDao.findById(id).orElseThrow(() -> new EmployeeException("Employees  Doesn't Exist with Id "+id));
		
		EmpDao.delete(existingEmployees );
			
		 return existingEmployees ;
	}

	

	@Override
	public Employees updateEmployees (Integer id, Employees Employees ) throws NotFoundException {
	
		
		 Optional<Employees> foundEmployees  =  EmpDao.findById(id);
		 if(!foundEmployees .isPresent()) throw new NotFoundException("Employees  not found to update with " + id);
		 
		 Employees updateEmployees  = foundEmployees .get();
		 
	     updateEmployees.setId(Employees.getId());
		 updateEmployees.setName(Employees.getName());
		 updateEmployees.setEmail(Employees.getEmail());
		 updateEmployees.setState(Employees.getState());
		 updateEmployees.setMobile(Employees.getMobile());
		 updateEmployees.setDesignation(Employees.getDesignation());
		 
		
          return EmpDao.save(updateEmployees );
	}
	

	@Override
	public Employees getEmployeesById(Integer id) throws EmployeeException {
		
		   Optional<Employees> opt = EmpDao.findById(id);
			 
		    if(opt.isPresent()) {
		    	return opt.get();
		    }else
		    	throw new EmployeeException("Employees  Doesn't Exist With Id :" + id);
	}
	
}
