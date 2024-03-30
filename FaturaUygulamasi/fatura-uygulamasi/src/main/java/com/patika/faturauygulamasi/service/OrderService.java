package com.patika.faturauygulamasi.service;

import lombok.RequiredArgsConstructor;
import com.patika.faturauygulamasi.model.Order;
import org.springframework.stereotype.Service;
import com.patika.faturauygulamasi.repository.OrderRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Order save(Order order){
        orderRepository.save(order);
        return order;
    }

    public List<Order> getAll(){
        return orderRepository.getAll();
    }

}
