package tekup.tn.tp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tekup.tn.tp.Repository.OrderDetailRepository;
import tekup.tn.tp.entity.OrderDetail;

@Service
public class OrderDetailService {
@Autowired
    OrderDetailRepository orderDetailRepository ;
 public  float calculateTotal(){
     float t=0 ;
     for (OrderDetail o:orderDetailRepository.findAll() ) {
         t+= o.getTax();
     }
     return  t ;
 }
 public float	calculateWeight() {
     float t=0 ;
     for (OrderDetail o:orderDetailRepository.findAll() ) {
    	 t +=o.getItem().getWeight();
     }
     return  t ;
 }
}
