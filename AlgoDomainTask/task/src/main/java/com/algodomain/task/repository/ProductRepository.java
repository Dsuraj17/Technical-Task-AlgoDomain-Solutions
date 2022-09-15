package com.algodomain.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algodomain.task.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
	Product findByName(String name);
}
