package com.miniproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miniproject.demo.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
