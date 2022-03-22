package com.telran;

import com.telran.products.Computer;
import com.telran.products.LapTop;
import com.telran.products.MobilePhone;
import com.telran.products.Product;
import com.telran.service.Selling;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MobilePhone phone1 = new MobilePhone("apple",1100);
        Computer computer1 = new Computer("lenovo",800);
        LapTop laptop1 = new LapTop("sony",600);

        Product[] products = {phone1,computer1,laptop1};
        for (Product product: products) {
            System.out.println(product);
        }
        Selling selling = new Selling(phone1);
        Selling selling1 = new Selling(computer1);
        Selling selling2 = new Selling(laptop1);

        selling.amountOfSold();
    }
}
