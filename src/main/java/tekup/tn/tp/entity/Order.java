package tekup.tn.tp.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@ToString
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "TbOrder")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idOrder ;
    @Temporal(value = TemporalType.DATE)
    Date  createdDate ;
    @Enumerated(value = EnumType.ORDINAL )
    OrderStatus orderStatus ;
    @ManyToOne()
    Customer customer ;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "order")
    List<OrderDetail> orderDetails ;
}
