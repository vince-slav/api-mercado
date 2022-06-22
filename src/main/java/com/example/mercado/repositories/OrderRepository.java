package com.example.mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mercado.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
