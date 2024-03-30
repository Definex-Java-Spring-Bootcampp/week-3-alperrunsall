package com.patika.faturauygulamasi.controller;

import lombok.RequiredArgsConstructor;
import com.patika.faturauygulamasi.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.patika.faturauygulamasi.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer create(@RequestBody Customer customer){
        System.out.println("Müşteri oluşturuldu!");
        return customerService.save(customer);
    }

    @GetMapping("{name}")
    public Customer getByName(@PathVariable String name){
        return customerService.getByName(name);
    }

    @GetMapping
    public List<Customer> getAll() {
        return customerService.getAll();
    }

}
