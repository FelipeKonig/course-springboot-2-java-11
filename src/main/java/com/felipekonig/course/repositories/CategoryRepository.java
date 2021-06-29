package com.felipekonig.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipekonig.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
