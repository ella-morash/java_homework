package com.company;


import java.util.Objects;

public class Manager extends Employee {

    private double bonus;




    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;

    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            if (this == o) return true;
            if (!(o instanceof Manager)) return false;
            if (!super.equals(o)) return false;
            Manager manager = (Manager) o;
            return Double.compare(manager.bonus, bonus) == 0;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus) + super.hashCode();
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
