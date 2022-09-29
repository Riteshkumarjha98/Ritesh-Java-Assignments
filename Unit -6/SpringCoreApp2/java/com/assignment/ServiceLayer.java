package com.assignment;

public class ServiceLayer {
	
	private int a;
	private int b;
	
	private Calculator operation;
	
	
	void doEvaluation() {
		
		System.out.println("Result is :" + operation.evaluate(a, b));
		
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
