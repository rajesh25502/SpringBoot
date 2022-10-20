package com.demo.demo.service;

import com.demo.demo.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService
{
    private int Count=1;
    private List<Customer> list= new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer)
    {
        customer.setCid(Count);
        /*customer.setC_Fname("Rajesh");
        customer.setC_LName("Poojari");
        customer.setC_phone(953513);
        customer.setC_email("rajesh@gmail.com");
        customer.setC_Addr("Kundapura");*/
        list.add(customer);
        //list.add(customer);
        System.out.println(list);
        Count++;

        return customer;
    }
    public List<Customer> getCustomer()
    {
        return list;
    }
    public Customer getCustomer(int cid)
    {
        return list.stream().filter(c-> c.getCid()==cid).findFirst().get();
    }
    public Customer update(int cid, Customer customer)
    {
        list.stream().forEach(c->{
            if(c.getCid()==cid)
            {
                c.setFname(customer.getFname());
                c.setLname(customer.getLname());
                c.setEmail(customer.getEmail());
            }
        });

        return list.stream().filter(c-> c.getCid()==cid).findFirst().get();
    }
    public void delete(int cid)
    {
        list.stream().forEach(c->{
            if(c.getCid()==cid)
            {
                list.remove(c);
            }
        });
    }

}
