package com.masai.services;

import java.util.List;

import com.masai.exception.ProductException;
import com.masai.model.Product;

public interface ProductService {
 
    public Product saveProduct(Product product);
    
    public Product getProductById(Integer id) throws ProductException;
    
    public List<Product> getAllProductDetaisl() throws ProductException;
    
    public Product updateProduct(Product product)throws ProductException;
    
    public Product deleteProductById(Integer id)throws ProductException;
	
			


	
}
