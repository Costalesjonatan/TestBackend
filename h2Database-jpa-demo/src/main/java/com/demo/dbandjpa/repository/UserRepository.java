package com.demo.dbandjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.dbandjpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
