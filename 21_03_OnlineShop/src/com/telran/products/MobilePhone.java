package com.telran.products;

public class MobilePhone extends Product{
    public MobilePhone(String model, double price) {
        super(model, price);
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
