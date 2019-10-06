package eyael_demo.demo.service;

import eyael_demo.demo.dao.CustomerDAO;
import eyael_demo.demo.exception.CustomerNotFoundException;
import eyael_demo.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
@Component
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    public Customer addcustomer(Customer customer) {
             return customerDAO.save(customer);
    }

    public List<Customer> getCustomers() {
        return customerDAO.findAll();
    }

    public Customer getcustomer(int customerid){
        Optional<Customer> optionalCustomer = customerDAO.findById(customerid);
        if(!optionalCustomer.isPresent())
            throw new CustomerNotFoundException("Customer wef yelem....");
        return optionalCustomer.get() ;
     }

      public Customer updateCustomer(int customerid,Customer customer) {
        customer.setCustomerId(customerid);
         return customerDAO.save(customer);

      }

          public void  deleteCustomer(int customerid){
              customerDAO.deleteById(customerid);
          }

     }



