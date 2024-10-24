package com.example.tpp1.Repository;


import com.example.tpp1.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


    @Repository
    public interface CustomerRepository extends JpaRepository<Customer, Long> {
        List<Customer> findByAdress(String adress);
        List<Customer> findCategoryByAdressAndCity(String adress,String city);
    }

