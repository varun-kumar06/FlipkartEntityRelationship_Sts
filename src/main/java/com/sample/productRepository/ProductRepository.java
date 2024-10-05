package com.sample.productRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}
