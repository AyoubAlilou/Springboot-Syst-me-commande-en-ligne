package tekup.tn.tp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tekup.tn.tp.Service.CustomerService;
import tekup.tn.tp.Service.DeliveryService;
import tekup.tn.tp.entity.Customer;
import tekup.tn.tp.entity.Delivery;
import tekup.tn.tp.entity.util.Periode;

import java.util.List;

@RestController
public class CustomerController {
@Autowired
CustomerService CustomerService ;
@GetMapping("/Top5")
    public List<Customer> gettop(){
    return CustomerService.getTop5();
}
    @GetMapping("/customerpeiode")
    public List<Customer> getperiode(@RequestBody Periode periode){
        return CustomerService.findperiode(periode.getDatestart(), periode.getDateEnd()) ;
    }

}

