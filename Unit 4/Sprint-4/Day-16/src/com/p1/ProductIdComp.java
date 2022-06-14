package com.p1;

import java.util.Comparator;

public class ProductIdComp implements Comparator <Product> {

	@Override
	public int compare(Product P1, Product p2) {
		if( P1.getProductId() > P1.getProductId())
		return +1;
		else 
			return -1;
	}

	
	
}