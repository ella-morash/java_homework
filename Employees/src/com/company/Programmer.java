package com.company;

public class Programmer extends Employee {


    public Programmer(String name, double salary) {

        super(name,salary);
    }

    public void doWork() {

        System.out.println("I am  programmer " + getName() + " I write code");
    }

    @Override
    public String toString() {

        return super.toString() + " Programmer";
    }


}
