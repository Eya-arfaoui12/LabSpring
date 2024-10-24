package com.example.tpp1.Models;


import jakarta.persistence.*;


import java.util.List;

@Entity
public class Customer extends User {

    public String adress;
    public String city;

    public Customer(){super();}
    @OneToMany(mappedBy = "customer",cascade = CascadeType.REMOVE)
    private List<Order> orders;

}
