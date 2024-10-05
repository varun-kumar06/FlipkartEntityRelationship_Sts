package com.sample.orderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.OrderEntity;
import com.sample.orderDao.OrderDao;

@Service
public class OrderService {
	
	@Autowired
	OrderDao od;
	
	public String postsingleObject(OrderEntity oe ) {
		return od.postsingleObject(oe);
	}
	
	 public List<Object> getOderAndProduct(){
		 return od.getOderAndProduct();
	 }

}
