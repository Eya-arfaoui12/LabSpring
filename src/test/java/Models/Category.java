//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.tpp1.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    public Long id;
    public String titre;
    public String description;
    @OneToMany(
            mappedBy = "category",
            cascade = {CascadeType.REMOVE}
    )
    private List<Subcategory> subcategories;

    public Category() {
    }
}