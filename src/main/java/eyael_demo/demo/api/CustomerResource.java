package eyael_demo.demo.api;

import eyael_demo.demo.model.Customer;
import eyael_demo.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerResource {
    @Autowired
    private CustomerService customerService;


    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addcustomer(customer);

    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }
    @GetMapping(value = "/{customerid}")
    public Customer getcustomer(@PathVariable ("customerid")int customerid){
        return customerService.getcustomer(customerid);

    }
    @PutMapping(value ="/{customerid}")
   public Customer updateCustomer(@PathVariable ("customerid")int customerid,@RequestBody Customer customer){
               return customerService.updateCustomer(customerid,customer)  ;

    }
    @DeleteMapping(value = "/{customerid}")
    public void  deleteCustomer(@PathVariable("customerid")int customerid){
        customerService.deleteCustomer(customerid);
    }

}

