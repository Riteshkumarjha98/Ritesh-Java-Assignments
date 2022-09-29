package com.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {
	
	
	private int a;
	private int b;
	
	@Autowired
	@Qualifier("cal")
	private Calculator operation;
	
	void doEvaluation() {
		
	System.out.println("Ouput Result is :" + operation.evaluate(a, b));
		
	}
	
     public void setA(int a) {
		this.a = a;
	}

   public void setB(int b) {
		this.b = b;
	}

	public void setOperation(Calculator operation) {
		this.operation = operation;
	}
	
	

}
