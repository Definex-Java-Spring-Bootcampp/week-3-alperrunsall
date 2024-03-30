package com.patika.faturauygulamasi.model;

import com.patika.faturauygulamasi.enums.ProductType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private String name;
    private int stock;
    private double price;
    private ProductType type;
}
