package com.p1;

import java.util.Comparator;

public class ProductPriceComp implements Comparator <Product> {

	@Override
	public int compare(Product p1, Product p2) {
	 if(p1.getProductPrice()>p2.getProductPrice())
		return +1;
	 else 
		 return -1;
	}

}
