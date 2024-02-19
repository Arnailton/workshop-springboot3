package com.arnailton.course.arnailton.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arnailton.course.arnailton.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
