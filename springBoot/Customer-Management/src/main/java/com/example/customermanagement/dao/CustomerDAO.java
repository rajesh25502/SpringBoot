package com.example.customermanagement.dao;

import com.example.customermanagement.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends CrudRepository<Customer,Integer>
{
    @Override
    List<Customer> findAll();
}
