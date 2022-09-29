package com.masai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.exceptions.DepartmentException;
import com.masai.model.Department;
import com.masai.repository.DepartmentDao;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao DepDao;
	
	public Department AddDepartment(Department Department) {
		
		Department AddDepartment = DepDao.save(Department);
		
		return AddDepartment;
	}
	@Override
	public Department updateDepartment(Department Department) throws DepartmentException {
		Optional<Department> opt = DepDao.findById(Department.getDepartmentid());
		if(opt.isPresent()) {
			return DepDao.save(Department);
		}
		else  throw new DepartmentException ("Invalid Department Detail");
		
	}

	@Override
	public Department deleteDepartmentById(Integer id) throws DepartmentException {
		Department existingDepartment = DepDao.findById(id).orElseThrow(() -> new DepartmentException ());
		
		DepDao.delete(existingDepartment);
		return existingDepartment;
	}

	@Override
	public List<Department> getAllDepartmentDetaisl() throws DepartmentException {
		  List<Department>department =DepDao.findAll();
		    
		    if(department.size() > 0)
		    	return department;
		    else
		    	throw new DepartmentException("Department Not Found");
	}

	
}