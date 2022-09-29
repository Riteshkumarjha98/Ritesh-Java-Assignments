package com.masai.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {
      
	
	
	List<Product> list;
	
     public ProductServiceImpl() {
		list = new ArrayList<Product>();
	    list.add(new Product (1,"Boolet",1500000,"Royal_Enfield","Two_Wheller",8000020,2022));
		list.add(new Product (2,"Zixer",1500000,"Suzuki","Two_Wheller",120000,2022));
		list.add(new Product (3,"Pulsar",1500000,"Bajaj","Two_Wheller",90000,2022));
	    list.add(new Product (4,"Shine",1500000,"Honda","Two_Wheller",7000,2022));
		list.add(new Product (5,"Boolet",1500000,"Spledner Plus","Two_Wheller",85000,2022));
	}
	
     
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return list;
	}

	
	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		
		Product P = null;
		
		for(Product product: list) {
			if(product.getId() == id) {
			   P = product;	
			   break;
			}
			
		}
		return P;
	}
	
	
	
	@Override
	public Product addProduct(Product product) {
	
		list.add(product);
		return product;
	}
	
	
	// Updating Product 
	
	@Override
	public Product updateProduct(Integer id) {
		
       Product prod =  getProduct(id);
	    prod.setPrice(150000);

		return prod;
	}
	
	
	
	// Deleting product
	@Override
	public Product deleteProduct(Integer id) {
		Product product =  getProduct(id);
		list.remove(product);
		
		return product;
	}
	
	
	

}
