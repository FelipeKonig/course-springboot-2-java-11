package com.felipekonig.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipekonig.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
