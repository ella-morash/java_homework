package com.telran.service;

import com.telran.products.Product;

public class Selling {
    Product product;
    static int count;

    public Selling(Product product) {
        this.product = product;
        count++;
    }

    public void amountOfSold(){
        if (count == 1) System.out.println("There is " + count + " product sold");
        System.out.println("There are " + count + " products sold");

    }
}
