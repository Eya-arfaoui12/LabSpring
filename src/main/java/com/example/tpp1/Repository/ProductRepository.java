package com.example.tpp1.Repository;

import com.example.tpp1.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


    @Repository
    public interface ProductRepository extends JpaRepository<Product, Long> {
        List<Product> findByName(String name);
        List<Product> findProductByPriceAndDescriptionAndName(int price,String description,String name);
    }
