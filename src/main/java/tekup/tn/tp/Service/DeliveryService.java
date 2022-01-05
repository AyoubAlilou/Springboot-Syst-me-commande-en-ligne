package tekup.tn.tp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tekup.tn.tp.Repository.DeliveryRepository;
import tekup.tn.tp.entity.Delivery;

@Service
public class DeliveryService {
    @Autowired
    DeliveryRepository deliveryRepository ;
    public Delivery GetRapiddelivery (){
       return  deliveryRepository.findRapid();
    }
    public Delivery Getlentdelivery (){
        return deliveryRepository.findlent();
    }
}
