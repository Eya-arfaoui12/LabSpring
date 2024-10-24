package Repository;

import com.example.tpp1.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);

    List<User> finduserBySalaryAndPhoneAndAgeAndEmailAndPasswordAndName(int salary, int phone, int age, String email, String password, String name);
}
