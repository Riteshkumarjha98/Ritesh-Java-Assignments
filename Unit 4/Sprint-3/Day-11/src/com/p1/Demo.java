package com.p1;

public class Demo {

	public static void main(String[] args) {
		ZImpl Zimpl = new ZImpl();
		Zimpl.abstractMethodX();
		Zimpl.abstractMethodY();
		Zimpl.defaultMethodX();
		Zimpl.defaultMethodY();
		
		X.staticMethodX();
		Y.staticMethodY();
	}
}
