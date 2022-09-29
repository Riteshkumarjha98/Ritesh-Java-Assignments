package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {
	
	
	private int a;
	
	private int b;
	
	private double r;
	
	@Autowired
	@Qualifier("cid")
	private Calculator operation;
	
	
	void doEvaluation() {
		
		System.out.println("Result is :" + operation.evaluate(a, b, r));
		
	}
	

	public void setA(int a) {
		this.a = a;
	}

	public double getR() {
		return r;
	}


	public void setR(int r) {
		this.r = r;
	}


	public void setB(int b) {
		this.b = b;
	}

	public void setOperation(Calculator operation) {
		this.operation = operation;
	}
	
	

}

