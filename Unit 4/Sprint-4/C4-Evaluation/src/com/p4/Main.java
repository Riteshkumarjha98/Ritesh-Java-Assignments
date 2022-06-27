package com.p4;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	 public static void main (String[]args) {
		 Set<Product> m1 = new LinkedHashSet<>();
		 
		 Ecommerce ecommerce=new Ecommerce();
		 
		 ecommerce.addProductToList(new Product("Shoes",2000,"Adidas",12));
		 ecommerce.addProductToList(new Product("Ipad",100000,"Apple",2));
		 ecommerce.addProductToList(new Product("Ipad",100000,"Apple",4));
		 ecommerce.addProductToList(new Product("Shoes",4000,"Nike",4));
		 ecommerce.addProductToList(new Product("Shoes",2000,"Adidas",8));
		 
		 System.out.println(ecommerce.showAllProduct());
		 
	 

		for (Product S : ecommerce.productList) {
			 m1.add(S);
		 }
		for( Product m:m1) {
			System.out.println("m.getProduct");
			
			System.out.println("Product added successfully");
		}
	 }
}
		 
		 
		
	 

