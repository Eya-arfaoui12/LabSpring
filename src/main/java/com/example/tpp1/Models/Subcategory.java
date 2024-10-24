package com.example.tpp1.Models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String title;
    public String description;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category categories;

  @ManyToOne
    private Product products;


}
