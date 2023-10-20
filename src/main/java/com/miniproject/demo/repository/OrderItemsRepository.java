package com.miniproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniproject.demo.model.OrderItem;

public interface OrderItemsRepository extends JpaRepository<OrderItem,Integer> {
}
