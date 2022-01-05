package tekup.tn.tp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tekup.tn.tp.Repository.CustomerRepository;
import tekup.tn.tp.entity.Customer;
import tekup.tn.tp.entity.Order;
import tekup.tn.tp.entity.OrderDetail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository ;
    public List<Customer> getTop5 (){
        return customerRepository.getAllByOrdersExists().subList(1,5);
    }
    public List<Customer>  findperiode (Date start , Date end ){
        List<Customer> lst = new ArrayList<>();
        for (Customer c: customerRepository.findAll()) {
            for (Order o: c.getOrders() ) {
            	if(o.getCreatedDate().after(end) && o.getCreatedDate().before(start)) {
            		for (OrderDetail od: o.getOrderDetails() ) {
            			if(od.getQty()<10) {
            				lst.add(c); 
            			}
            		}
            	}

            }

        }
        return lst ;     }

}
