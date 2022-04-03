package com.company;

import java.util.Arrays;

public class Manager extends Employee {
    private double bonus;




    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;

    }

    public double getBonus() {

        return bonus;
    }


    @Override
    public String toString() {

        return super.toString() + " Manager";
    }

    @Override
    public void getPaid() {
        System.out.println("I got paid " + (getSalary() + bonus));
        ;
    }

    @Override
    public void doWork() {
        System.out.println("I am a manager " + getName() + ". I do a lot!");
        ;
    }
}
