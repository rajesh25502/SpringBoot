package com.demo.demo.api;

import com.demo.demo.model.Customer;
import com.demo.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/customers")
public class CustomerResource {
    @Autowired
    private CustomerService customerservice;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer)
    {
        return customerservice.addCustomer(customer);
    }

    @GetMapping
    public List<Customer> getCustomers()
    {
        return customerservice.getCustomer();
    }

    @GetMapping(value = "/{id}")
    public Customer getCustomer(@PathVariable("id") int id)
    {
        return customerservice.getCustomer(id);
    }

    @PutMapping(value="/{id}")
    public Customer updateCustomer(@PathVariable("id") int id,@RequestBody Customer customer)
    {
        return customerservice.update(id,customer);
    }

    @DeleteMapping(value="{id}")
    public void deleteCustomer(@PathVariable("id") int id)
    {
        customerservice.delete(id);
    }
}
