package com.tsel.pet.project.spring.shop.repository;

import com.tsel.pet.project.spring.shop.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
