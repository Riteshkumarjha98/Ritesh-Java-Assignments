package com.usecases;

import java.util.Scanner;

import com.bean.Employee3;
import com.dao.Employee3Dao;
import com.dao.Employee3DaoImpl;
import com.exceptions.Employee3Exception;

public class GivingBonusToAll {

	
public static void main(String[] args) {
	
	Employee3Dao dao = new Employee3DaoImpl();
	
	try {
		boolean bonus = dao.GivingBonus();
		
		if(bonus)
			System.out.println("Bonus added 500:" + bonus);
		
		
	}
	catch (Employee3Exception e) {
		System.out.println(e.getMessage());
	}
}
}
