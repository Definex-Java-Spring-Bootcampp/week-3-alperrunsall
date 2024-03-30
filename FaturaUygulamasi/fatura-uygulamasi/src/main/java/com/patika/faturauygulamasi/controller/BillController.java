package com.patika.faturauygulamasi.controller;

import lombok.RequiredArgsConstructor;
import com.patika.faturauygulamasi.model.Bill;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.patika.faturauygulamasi.service.BillService;

import java.util.List;

@RestController
@RequestMapping("/api/bills")
@RequiredArgsConstructor
public class BillController {

    private final BillService billService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Bill create(@RequestBody Bill bill){
        System.out.println("Fatura oluşturuldu!");
        return billService.save(bill);
    }

    @GetMapping
    public List<Bill> getAll() {
        return billService.getAll();
    }
}
