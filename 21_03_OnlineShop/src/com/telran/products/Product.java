package com.telran.products;

public class Product {

    private String model;
    private double price;

    public Product(String model, double price) {

        this.model = model;
        this.price = price;
    }



    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
