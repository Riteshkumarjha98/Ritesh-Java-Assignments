package com.masai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.ProductException;
import com.masai.model.Product;
import com.masai.repository.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	private ProductDao prDao; //For accessing JPA repository
	
	


	@Override
	public Product saveProduct(Product product) {
		
	 Product savesProduct = prDao.save(product);	
		
	 return savesProduct;

       
	}




	
	@Override
	public Product getProductById(Integer id) throws ProductException{
		
	   Optional<Product> opt = prDao.findById(id);
		 
	    if(opt.isPresent()) {
	    	return opt.get();
	    }else
	    	throw new ProductException("Product does not exist with id :" + id);
	}



	@Override
	public List<Product> getAllProductDetaisl() throws ProductException {
	    List<Product>	products = prDao.findAll();
	    
	    if(products.size() > 0)
	    	return products;
	    else
	    	throw new ProductException("Product not found");
	}



	@Override
	public Product updateProduct(Product product) throws ProductException {
		
 Optional<Product> opt= prDao.findById(product.getId());
		
		if(opt.isPresent()) {
			
			//Student existingStudent= opt.get();
			
			return prDao.save(product);

			
			//save or update based on Id feild
			
			
			
		} else
			throw new ProductException("Invalid Product Details");
	}



	@Override
	public Product deleteProductById(Integer id) throws ProductException {
		
		Product existingProduct= prDao.findById(id).orElseThrow(() -> new ProductException("Product does not exist with id "+id));
			
		prDao.delete(existingProduct);
			
		
			return existingProduct;
		
	}




	

}
