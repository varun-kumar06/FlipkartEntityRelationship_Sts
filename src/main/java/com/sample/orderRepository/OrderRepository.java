package com.sample.orderRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sample.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{

	@Query(value= "select order_table.name, product_table.product_name from entityrelationship.order_table join entityrelationship.product_table on order_table.id= product_table.order_fkey", nativeQuery = true)
	  public List<Object> getOderAndProduct();
	  
	  
}
