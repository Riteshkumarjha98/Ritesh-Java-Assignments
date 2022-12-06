package com.masai.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.NotFoundException;
import com.masai.model.Order;

import com.masai.repository.OrderRepository;
import com.masai.service.OrderService;
import com.masai.exception.OrderException;

@Service
public class OrderServiceImpl implements OrderService{


    @Autowired
	private OrderRepository OrderRepo;
	 
	 
	@Override
	public Order createOrder(Order Order) throws NotFoundException {
		
		return OrderRepo.save(Order);
	}

	@Override
	public Order findOrderById(Integer id) throws NotFoundException {
	  Optional<Order> optOrder = OrderRepo.findById(id);
	   if(!optOrder.isPresent())
		   throw new NotFoundException("Order not Found with id : " + id);
		return optOrder.get();
	}


	@Override
	public Order getOrdersById(Integer id) throws NotFoundException {
		   Optional<Order> opt = OrderRepo.findById(id);
			  if(opt.isPresent()) {
		    	  return opt.get();
		    }
		    else
		    	
		    	throw new NotFoundException("Orders Doesn't Exist With Id :" + id);
		}


	@Override
	public List<Order> getAllOrdersDetails() throws NotFoundException {
	    List<Order> Orders = OrderRepo.findAll();
		     if(Orders.size()>0)
					return Orders;
				
				else 
					
					throw new NotFoundException("Orders Not Found");
		}


	@Override
	public Order CancelOrder(Integer id) throws NotFoundException {
     Order existingOrder = OrderRepo.findById(id).orElseThrow(() -> new OrderException("Order Doesn't Exist with Id "+id));
		 OrderRepo.delete(existingOrder);
			
		    return existingOrder;
	}




}
