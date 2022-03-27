package com.company;

import java.util.ArrayList;

public class Manager extends Employee{
    private double bonus;
    private static Employee[] team = new Employee[count + 1];



    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;

    }

    public double getBonus() {
        return bonus;
    }

    public Employee[] getTeam() {
        return team;
    }

    public void addEmployeeToTeam(Employee employee,int id){
        team[id]=employee;
    }


    @Override
    public String toString() {
        return super.toString() + " Manager";
    }

    @Override
    public void getPaid() {
        System.out.println("I got paid " + (getSalary()+bonus));;
    }

    @Override
    public void doWork() {
        System.out.println("I am a manager " + getName() + ". I do a lot!");;
    }
}
