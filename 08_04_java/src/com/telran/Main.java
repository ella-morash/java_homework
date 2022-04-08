package com.telran;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Order order1 = new Order(1,"car");
        Order order2 = new Order(1,"car");

        System.out.println(order1.equals(order2));
        System.out.println(order1.isEqual(order2));

    }
}
