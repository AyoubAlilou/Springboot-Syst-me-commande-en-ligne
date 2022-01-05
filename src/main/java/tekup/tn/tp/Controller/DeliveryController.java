package tekup.tn.tp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tekup.tn.tp.Service.DeliveryService;
import tekup.tn.tp.Service.OrderDetailService;
import tekup.tn.tp.entity.Delivery;

@RestController
public class DeliveryController {
@Autowired
    DeliveryService deliveryService ;
@GetMapping("/DeliveryRapid")
    public Delivery findDelveryRapid(){
    return deliveryService.GetRapiddelivery();
}
    @GetMapping("/Deliverylent")
    public Delivery findDelverylent(){
        return deliveryService.Getlentdelivery() ;
    }

}

