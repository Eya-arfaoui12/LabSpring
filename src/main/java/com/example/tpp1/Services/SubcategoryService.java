package com.example.tpp1.Services;

import com.example.tpp1.Models.Subcategory;
import com.example.tpp1.Repository.SubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubcategoryService {
    @Autowired
    SubcategoryRepository subcategoryRepository;

    public Subcategory createSubcategory(Subcategory subcategory) {
        return subcategoryRepository.save(subcategory);
    }

    public List<Subcategory> GetAllSubcategories() {
        return subcategoryRepository.findAll();
    }

    public Subcategory GetSubcategoryById(Long id) {
        return subcategoryRepository.findById(id).get();
    }
}
