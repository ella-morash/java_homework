package com.company;

public class Programmer extends Employee {


    public Programmer(String name, double salary) {

        super(name,salary);
    }

    public void doWork() {

        System.out.println("I am backend programmer " + getName() + " I write code and improve backend");
    }

    @Override
    public String toString() {
        return super.toString() + " Backend Programmer";
    }
}
