package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Manager extends Employee {
    private double bonus;
    private Employee[] team;


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

    public void addEmployeeToTeam(Employee employee) {
        if (team == null) {
            team = new Employee[8];
        }
         if (team[team.length-1]!=null){
             Employee[] newTeam = Arrays.copyOf(team,team.length*2);
             this.team = newTeam;

         }
         for (int i = 0; i < team.length; i++) {

            if (team[i] == null) {
                team[i] = employee;
                break;
            }

        }

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
