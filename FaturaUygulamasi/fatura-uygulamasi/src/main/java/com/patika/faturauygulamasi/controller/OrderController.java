package com.patika.faturauygulamasi.controller;

import lombok.RequiredArgsConstructor;
import com.patika.faturauygulamasi.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.patika.faturauygulamasi.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {


    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order create(@RequestBody Order order){
        System.out.println("Sipariş oluşturuldu!");
        return orderService.save(order);
    }

    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }
}
