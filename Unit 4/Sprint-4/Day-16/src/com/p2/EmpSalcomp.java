package com.p2;

import java.util.Comparator;

public class EmpSalcomp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary() > o2.getSalary())
			return +1;
		else
		return -1;
	}

}
