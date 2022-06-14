package com.p1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class Main {

	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		
	 TreeSet<Product> prod = new TreeSet<Product >(new ProductIdComp());
	 
		System.out.println("Enter your choice '1' for Price sort ,'2' for Name sort, '3' for Product Id sort");
		int choice =in.nextInt();
		in.nextLine();
		
		if(choice ==1) {
			ProductPriceComp p = new ProductPriceComp();
			 prod = new TreeSet<Product>(p);
		}
		else if (choice ==2 ) {
			ProductNameComp N = new ProductNameComp();
		prod = new TreeSet<Product>(N);
		}else if (choice==3) {
			ProductIdComp id = new ProductIdComp();
			 prod = new TreeSet<Product>(id);
		}
		
		

		for(int i=1;i<=4;i++) {
			System.out.println("Enter Product Id");
			int id =in.nextInt();
			in.nextLine();
			
			System.out.println("Enter Product Name");
			String name = in.nextLine();
			
			System.out.println("Enter Product Price");
		  double price = in.nextDouble();
		  
		  
		  Product e = new Product(id, name, price);
		  prod.add(e);
		}
		
		
		
		for(Product s:prod) {
			System.out.println(s);
		}
	}
}

