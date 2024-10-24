package com.example.tpp1.Models;

import jakarta.persistence.*;


import java.util.List;

@Entity
public class Provider extends User {

    public String matricule;
    public String service;
    public String company;

    public Provider() {super();}
    @OneToMany(mappedBy = "provider",cascade = CascadeType.REMOVE)
    private List<Product> products;

}
