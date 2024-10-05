package com.sample.orderDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.OrderEntity;
import com.sample.orderRepository.OrderRepository;

@Repository
public class OrderDao {
	
	@Autowired
	OrderRepository or;
	
	public String postsingleObject(OrderEntity oe ) {
		or.save(oe);
		return "PostedSuccessfully";
	}

	public List<Object> getOderAndProduct() {
		
		return or.getOderAndProduct();
	}
	
	

}
