package com.example.mvc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvc.Model.Product;
public interface ProductRepository extends JpaRepository<Product,Integer>{

}
