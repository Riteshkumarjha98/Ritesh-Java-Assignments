package com.masai.services;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.EmployeeException;
import com.masai.model.Department;
import com.masai.model.Employee;
import com.masai.repository.DepartmentDao;
import com.masai.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeServices {

	@Autowired
	private EmployeeDao EmpDao;
	private DepartmentDao deptDao;
	
	
	@Override
	public Employee AddEmployee(Employee employee) {
		
		Optional<Employee> optEmp = Optional.ofNullable(EmpDao.findByEmail(employee.getEmail()));
	
		if(!otpEmp.isPresent(){
			Optional<Department>optdepartment = Optional.ofNullable(deptDao.findById(employee.getDepartment())));
			
		}
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		Optional<Employee> opt = EmpDao.findById(employee.getId());
		if(opt.isPresent()) {
			return EmpDao.save(employee);
		}
		else  throw new EmployeeException ("Invalid Employee Detail");
		
	}

	@Override
	public Employee deleteEmployeeById(Integer id) throws EmployeeException {
		Employee existingEmployee = EmpDao.findById(id).orElseThrow(() -> new EmployeeException ());
		
		EmpDao.delete(existingEmployee);
		return existingEmployee;
	}

	@Override
	public List<Employee> getAllEmployeeDetaisl() throws EmployeeException {
		  List<Employee>	employee = EmpDao.findAll();
		    
		    if(employee.size() > 0)
		    	return employee;
		    else
		    	throw new EmployeeException("Employee Not Found");
	}


}
