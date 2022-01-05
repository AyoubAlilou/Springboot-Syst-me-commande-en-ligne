package tekup.tn.tp.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    String name ;
    String deliveryAdress ;
    String contact ;
    boolean active ;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    List<Order> orders ;

}
