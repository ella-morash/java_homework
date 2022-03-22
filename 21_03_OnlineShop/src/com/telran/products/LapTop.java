package com.telran.products;

public class LapTop extends Product{

    public LapTop(String model, double price) {
        super(model, price);
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
