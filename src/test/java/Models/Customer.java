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
public class Customer extends User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    public Long id;
    public String adress;
    public String city;
    @OneToMany(
            mappedBy = "Order",
            cascade = {CascadeType.REMOVE}
    )
    private List<Order> orders;

    public Customer() {
    }
}
