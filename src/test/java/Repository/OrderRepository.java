package Repository;

import com.example.tpp1.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByRef(String ref);

    List<Order> findOrderByPriceAndDateAndRef(int price, Date date, String ref);
}
