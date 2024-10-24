package Repository;

import com.example.tpp1.Models.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubcategoryRepository extends JpaRepository<Subcategory, Long> {
    List<Subcategory> findByTitle(String title);

    List<Subcategory> findSubcategoriesByDescriptionAndTitle(String description, String title);
}