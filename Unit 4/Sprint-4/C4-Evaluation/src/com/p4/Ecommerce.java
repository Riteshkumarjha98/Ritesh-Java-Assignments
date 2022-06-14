package com.p4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {

	List<Product> productList=new ArrayList<>();
	
	 
	 static void addProductToList(Product product) {
		 product.add(product);
	}
	 List<Product>showAllProduct(){
		return productList;
		 
	 }
	 public void addProduct ( Product product) {
		 productList.add(product);
	
	 
}
}