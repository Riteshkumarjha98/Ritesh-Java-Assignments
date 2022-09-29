package com.masai.services;

import java.util.List;

import com.masai.entities.Product;

  public interface ProductService {
	
  public List<Product> getProducts(); 
  
  public Product getProduct(int id);
  
  public Product addProduct(Product product);
  
  public Product updateProduct(Integer id);
  
  public Product deleteProduct(Integer id);
}
