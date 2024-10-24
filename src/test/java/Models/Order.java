//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.tpp1.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    public Long id;
    public String ref;
    public int price;
    public Date date;
    @ManyToOne
    @JoinColumn(
            name = "id_customer"
    )
    private Customer customer;
    @ManyToMany(
            mappedBy = "Orders"
    )
    private List<Product> products = new ArrayList();

    public Order() {
    }
}

