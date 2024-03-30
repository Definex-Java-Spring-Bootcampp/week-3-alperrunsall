package com.patika.faturauygulamasi.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Order {
    private Customer customer;
    private List<Product> productList;
    private LocalDateTime time;
    private Bill bill;
}
