package com.patika.faturauygulamasi.repository;

import com.patika.faturauygulamasi.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepository {

    private List<Customer> customerList = new ArrayList<>();

    public void save(Customer customer){
        customerList.add(customer);
    }

    public List<Customer> getAll(){
        return customerList;
    }

    public Optional<Customer> findByName(String name){
        return customerList.stream()
                .filter(customer -> customer.getName().equals(name))
                .findFirst();
    }
}
