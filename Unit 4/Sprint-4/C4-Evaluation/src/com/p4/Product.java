package com.p4;

import java.util.Objects;

public class Product {
	  String name;
      double price;
	 String company;
	int count;
   
	
   public Product(String name, double price, String company) {
		super();
		this.name = name;
		this.price = price;
		this.company = company;
	}

	public Product(String string, int i, String string2, int j) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int hashCode() {
		return Objects.hash(company, count, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		
		return Objects.equals(company, other.company) && count == other.count && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
//
//	public void add(Product product) {
//		// TODO Auto-generated method stub
//	         
//	
//	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", company=" + company + ", count=" + count + "]";
	}

	public void add(Product product) {
		 
		
	}

	

	

}

