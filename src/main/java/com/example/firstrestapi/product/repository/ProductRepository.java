package com.example.firstrestapi.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.firstrestapi.product.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
//Repozytoria mają w sobie wbudowane metody którymi posługuje sie product service