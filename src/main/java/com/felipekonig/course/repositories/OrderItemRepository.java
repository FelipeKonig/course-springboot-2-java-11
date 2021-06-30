package com.felipekonig.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipekonig.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
