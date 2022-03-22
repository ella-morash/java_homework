package com.telran.products;

public class Computer extends Product{

    public Computer(String model, double price) {
        super(model, price);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
