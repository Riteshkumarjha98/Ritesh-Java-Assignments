package com.dao;

import java.util.List;

import com.bean.Employee3;
import com.exceptions.Employee3Exception;




public interface Employee3Dao {

	
 // public String insertEmployeeDetails (int eid, String name, String address, int salary);



  public String insertEmployeeDetails2(Employee3 employee3);

 Employee3 getEmployee3Byeid(int eid) throws Employee3Exception;



List<Employee3> getAllEmployee3s() throws Employee3Exception;

 // int getSalaryByeid(int eid) throws Employee3Exception;


List<Employee3> getAllEmployee3salary_less8k() throws Employee3Exception;


public boolean GivingBonus() throws Employee3Exception;

int getSalaryByEid(int eid) throws Employee3Exception;


}
