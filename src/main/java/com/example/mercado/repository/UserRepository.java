package com.example.mercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.mercado.entities.User;

@Service
public interface UserRepository extends JpaRepository<User, Integer> {

}
