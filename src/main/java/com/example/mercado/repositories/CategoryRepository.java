package com.example.mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mercado.entities.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
