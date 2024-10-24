package com.example.tpp1.Repository;

import com.example.tpp1.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByTitre(String titre);
    List<Category> findCategoryByDescriptionAndTitre(String description,String titre);
}
