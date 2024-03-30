package com.patika.faturauygulamasi.service;

import lombok.RequiredArgsConstructor;
import com.patika.faturauygulamasi.model.Customer;
import org.springframework.stereotype.Service;
import com.patika.faturauygulamasi.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer save(Customer customer){
        customerRepository.save(customer);
        return customer;
    }

    public List<Customer> getAll(){
        return customerRepository.getAll();
    }

    public Customer getByName(String name){
        Optional<Customer> foundCustomer = customerRepository.findByName(name);
        return foundCustomer.orElse(null);
    }
}
