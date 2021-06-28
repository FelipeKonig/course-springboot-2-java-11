package com.felipekonig.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipekonig.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
