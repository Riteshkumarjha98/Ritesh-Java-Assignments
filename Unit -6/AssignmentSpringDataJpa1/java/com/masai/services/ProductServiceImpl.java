package com.masai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.ProductException;

import com.masai.model.Product;

import com.masai.repository.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
   private ProductDao prodDao;  // Accessing JPA repository methods
 
	
	
	@Override
	public Product saveProduct(Product product) {
		
	Product savedProduct = prodDao.save(product);
	   return savedProduct;
	}

	
	
	
	@Override
	public Product getProductById(Integer id) throws ProductException{
		
	   Optional<Product> opt = prodDao.findById(id);
		 
	    if(opt.isPresent()) {
	    	return opt.get();
	    }else
	    	throw new ProductException("Product Doesn't Exist With Id :" + id);
	}



	@Override
	public List<Product> getAllProductDetaisl() throws ProductException {
	    List<Product>	products = prodDao.findAll();
	    
	    if(products.size() > 0)
	    	return products;
	    else
	    	throw new ProductException("Product Not Found");
	}

	@Override
	public Product updateProduct(Product product) throws ProductException {
		
 Optional<Product> opt= prodDao.findById(product.getId());
		
		if(opt.isPresent()) {
			
		return prodDao.save(product);
	
		} else
			throw new ProductException("Invalid Product Details");
	}



	@Override
	public Product deleteProductById(Integer id) throws ProductException {
		
		Product existingProduct= prodDao.findById(id).orElseThrow(() -> new ProductException("Product Doesn't Exist with Id "+id));
			
		prodDao.delete(existingProduct);
			
		 return existingProduct;
	
	}

}
