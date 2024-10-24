package com.example.tpp1.Models;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    public Long id;
    public String name;
    public int salary;
    public int phone;
    public int age;
    public String email;
    public String password;

    public User(){}


}
