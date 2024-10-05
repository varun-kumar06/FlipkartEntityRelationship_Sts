package com.sample.orderController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.OrderEntity;
import com.sample.orderService.OrderService;

@RestController
@RequestMapping(value="/Order")
public class OrderController {
	
	@Autowired
	OrderService os;
	
	@PostMapping(value="/postorder")
	public String postsingleObject(@RequestBody OrderEntity oe ) {
		return os.postsingleObject(oe);
	}
	
	@GetMapping(value="/getOrderAndProduct")
	 public List<Object> getOderAndProduct(){
		return os.getOderAndProduct();
	}
	

}
