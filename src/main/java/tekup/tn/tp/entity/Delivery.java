package tekup.tn.tp.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    String man ;
    @Temporal(value = TemporalType.DATE)
    Date shopppingDate ;
    Date deliveryDate ;
    @ManyToOne()
    Order order ;
}
