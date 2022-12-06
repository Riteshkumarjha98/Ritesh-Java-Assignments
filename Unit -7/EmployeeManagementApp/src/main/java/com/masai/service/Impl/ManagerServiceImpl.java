package com.masai.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.NotFoundException;
import com.masai.model.Employee;
import com.masai.model.Manager;
import com.masai.repository.EmployeeDao;
import com.masai.repository.ManagerDao;
import com.masai.service.ManagerService;


@Service
public class ManagerServiceImpl implements ManagerService{
 
	
	@Autowired
	private ManagerDao managerDao;
	
	@Autowired
	private EmployeeDao empDao;
	
	@Override
	public Manager saveManger(Manager manager) throws NotFoundException {
		// TODO Auto-generated method stub
		return managerDao.save(manager);
	}

	@Override
	public Manager findMangerWithEmployeeId(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		
		 Optional<Employee> optEmployee =	empDao.findById(id);
		   if(!optEmployee.isPresent())
			   throw new NotFoundException("Employee not found with id : " + id);
				
		Employee foundEmployee = optEmployee.get();
		
		return foundEmployee.getManager();
	}

}
