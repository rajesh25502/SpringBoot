package com.example.customermanagement.service;

import com.example.customermanagement.dao.CustomerDAO;
import com.example.customermanagement.exception.CustomerNotFoundException;
import com.example.customermanagement.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService
{
    @Autowired
    private CustomerDAO customerDAO;
    private int Count=1;
    private List<Customer> list= new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer)
    {
        return customerDAO.save(customer);
    }
    public List<Customer> getCustomer()
    {
        return customerDAO.findAll();
    }
    public Customer getCustomer(int cid)
    {
        Optional<Customer> optionalCustomer=customerDAO.findById(cid);

        if(!optionalCustomer.isPresent())
        {
            throw new CustomerNotFoundException("Customer record not available");
        }
        return optionalCustomer.get();

        //return customerDAO.findById(cid).get();
    }
    public Customer update(int cid, Customer customer)
    {

        customer.setCid(cid);
        return customerDAO.save(customer);
    }
    public void delete(int cid)
    {
        customerDAO.deleteById(cid);
    }
}
