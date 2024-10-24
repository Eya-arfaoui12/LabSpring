package com.example.tpp1.Models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String name;
    public int price;
    public  String description;

    @OneToMany(mappedBy = "product")
    private List<Subcategory> subcategories;


    @ManyToOne
    @JoinColumn(name = "id_provider")
    private Provider provider;

    @ManyToMany
    @JoinTable(
            name = "Product_Order",
            joinColumns = @JoinColumn(name = "id_product"),
            inverseJoinColumns = @JoinColumn(name = "id_order")

    )
    private List<Order> orders = new ArrayList<>();
    public Product() {}
}
