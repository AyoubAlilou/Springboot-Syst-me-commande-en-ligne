package tekup.tn.tp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tekup.tn.tp.entity.Customer;
import tekup.tn.tp.entity.Order;

import java.util.List;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
        List<Customer> getAllByOrdersExists();
}
