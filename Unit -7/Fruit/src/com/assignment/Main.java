package com.assignment;

import java.util.Arrays;


interface Fruit{
		void hasAPeel();
		void hasARoot();
		
	}

	interface Vegetable{
		
	}

	class Tomato implements Fruit,Vegetable{

		public void hasAPeel() {
			// TODO Auto-generated method stub
			System.out.println("Inside hasAPeel Method..");
			
		}

		public void hasARoot() {
			// TODO Auto-generated method stub
			System.out.println("Inside hasARoot Method..");
			
		}
		
	}

	public class Main{
		public static void main(String[] args) {
			
			Tomato t = new Tomato();
			t.hasAPeel();
			t.hasARoot();
			
			
		}
	}
	
		





     
	

		
	
