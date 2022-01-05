package tekup.tn.tp.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@NoArgsConstructor
@ToString
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class OrderDetail {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id ;
int qty ;
float tax ;
@ManyToOne()
    Order order ;
@ManyToOne()
    Item item ;

}
