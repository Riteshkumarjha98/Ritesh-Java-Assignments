package com.p1;

import java.util.Comparator;

public class ProductNameComp implements Comparator <Product> {

	@Override
	public int compare(Product N1, Product N2) {
	  return N1.getProductName().compareTo( N2.getProductName());
	}

}
