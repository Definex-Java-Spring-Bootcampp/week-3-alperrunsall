package com.patika.faturauygulamasi.repository;

import com.patika.faturauygulamasi.model.Bill;
import com.patika.faturauygulamasi.producer.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BillRepository {

    private List<Bill> billList = new ArrayList<>();

    public void save(Bill bill){
        billList.add(bill);

    }

    public List<Bill> getAll(){
        return billList;
    }

}
