package com.felipekonig.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipekonig.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
