package com.masai.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.exception.ProductException;
import com.masai.model.Product;

@Service
public interface ProductService {
 
    public Product saveProduct(Product product);
    
    public Product getProductById(Integer id) throws ProductException;
    
    public List<Product> getAllProductDetaisl() throws ProductException;
    
    public Product updateProduct(Product product)throws ProductException;
    
    public Product deleteProductById(Integer id)throws ProductException;
	
			


	
}
