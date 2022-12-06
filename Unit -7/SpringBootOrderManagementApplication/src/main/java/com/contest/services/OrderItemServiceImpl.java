package com.contest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.contest.exception.NotFoundException;
import com.contest.model.OrderItem;
import com.contest.repository.OrderItemRepository;
import com.contest.exception.OrdersException;


@Service
public class OrderItemServiceImpl implements OrderItemService{

	 @Autowired
	private OrderItemRepository OrdersRepo;
	 
	 
	@Override
	public OrderItem createOrders(OrderItem Orders) throws NotFoundException {
		// TODO Auto-generated method stub
		return OrdersRepo.save(Orders);
	}


	@Override
	public OrderItem findOrdersById(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		
	   Optional<OrderItem> optOrders =	OrdersRepo.findById(id);
	   if(!optOrders.isPresent())
		   throw new NotFoundException("Orders not Found with id : " + id);
		    return optOrders.get();
	}


	@Override
	public OrderItem getOrderssById(Integer id) throws NotFoundException {
		   Optional<OrderItem> opt = OrdersRepo.findById(id);
			 
		    if(opt.isPresent()) {
		    	return opt.get();
		    }
		    else
		    	
		    	throw new NotFoundException("Orderss Doesn't Exist With Id :" + id);
		}


	@Override
	public List<OrderItem> getAllOrderssDetails() throws NotFoundException {
	    List<OrderItem> Orderss = OrdersRepo.findAll();
		
				if(Orderss.size()>0)
					return Orderss;
				
				else 
					
					throw new NotFoundException("Orderss Not Found");
		}


	@Override
	public OrderItem CancelOrders(Integer id) throws NotFoundException {
       OrderItem existingOrders = OrdersRepo.findById(id).orElseThrow(() -> new OrdersException("Orders Doesn't Exist with Id "+id));
		
     
	OrdersRepo.delete(existingOrders);
			
		 return existingOrders;
	}


	

}
