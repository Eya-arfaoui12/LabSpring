package com.example.tpp1.Models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String ref;
    public int price;
    public Date date;


    @ManyToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;

    @ManyToMany(mappedBy = "Orders", cascade = CascadeType.REMOVE)
    private List<Product> products = new ArrayList<>();
    public Order() {}

}
