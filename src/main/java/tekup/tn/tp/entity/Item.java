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
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
     float weight ;
     float price ;
    @OneToMany(mappedBy = "item" ,cascade = CascadeType.ALL)
    List<OrderDetail> orderDetails ;
}
