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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Subcategory {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    public Long id;
    public String title;
    public String description;
    @ManyToOne
    @JoinColumn(
            name = "id_category"
    )
    private Category category;
    @OneToMany(
            mappedBy = "product",
            cascade = {CascadeType.REMOVE}
    )
    private List<Product> products;

    public Subcategory() {
    }
}

