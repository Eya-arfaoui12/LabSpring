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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    public Long id;
    public String name;
    public int price;
    public String description;
    @ManyToOne
    @JoinColumn(
            name = "id_subcategory"
    )
    private Subcategory subcategory;
    @ManyToOne
    @JoinColumn(
            name = "id_provider"
    )
    private Provider provider;
    @ManyToMany
    @JoinTable(
            name = "Product_Order",
            joinColumns = {@JoinColumn(
                    name = "id_product"
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "id_order"
            )}
    )
    private List<Order> orders = new ArrayList();

    public Product() {
    }
}
