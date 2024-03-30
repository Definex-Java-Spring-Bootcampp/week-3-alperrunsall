package com.patika.faturauygulamasi.repository;

import com.patika.faturauygulamasi.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    private List<Order> orderList = new ArrayList<>();

    public void save(Order order){
        orderList.add(order);
    }

    public List<Order> getAll(){
        return orderList;
    }
}
