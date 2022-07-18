package usecases;

import java.util.Scanner;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import bean.Employee;
import exceptions.EmployeeException;

public class Get_Employee_By_Id {

	
public static void main(String[] args) throws EmployeeException {
		
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Eid");
		int Eid= sc.nextInt();

	
		EmployeeDao dao = new EmployeeDaoImpl();
		
		Employee Employee= dao.getEmployeeByeid(Eid);
		
		
		System.out.println(Employee);
		
		
		
		
		
	}

}

