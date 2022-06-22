package com.example.mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mercado.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
