package Repository;

import com.example.tpp1.Models.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {
    List<Provider> findByMatricule(String matricule);

    List<Provider> findProviderByServiceAndCompanyAndMatricule(String service, String company, String matricule);
}