package tekup.tn.tp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tekup.tn.tp.Service.OrderDetailService;

@RestController
public class OrderDatailController {
@Autowired
    OrderDetailService  orderDetailService ;
@GetMapping("/orderDatailTotal")
    public float caluclerTotal(){
    return orderDetailService.calculateTotal() ;
}
    @GetMapping("/calculateWeight")
    public float calculateWeight(){
        return orderDetailService.calculateWeight() ;
    }

}

