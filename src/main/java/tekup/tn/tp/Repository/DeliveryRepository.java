package tekup.tn.tp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tekup.tn.tp.entity.Delivery;


@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
  @Query("select  d from Delivery  d where d.deliveryDate-d.shopppingDate> (select  d.deliveryDate-d.shopppingDate from Delivery  d  ) ")
    public Delivery findRapid();
    @Query("select  d from Delivery  d where d.deliveryDate-d.shopppingDate<(select  d.deliveryDate-d.shopppingDate from Delivery  d  ) ")
    public Delivery findlent();
}
