package com.example.tpp1.Models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String titre;
    public String description;

    @OneToMany(mappedBy = "categories",cascade = CascadeType.REMOVE)
    private List<Subcategory> subcategoryList;
    public Category() {}
}
