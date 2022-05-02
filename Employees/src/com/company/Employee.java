package com.company;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Employee implements Comparable<Employee> {
    private String name;
    private double salary;



    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;


    }

    @Override
    public int compareTo(Employee employee) {
        return this.name.compareTo(employee.name);
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    public String getName() {

        return name;
    }

    public double getSalary() {

        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void getPaid(){

        System.out.println("I got the paid " + salary);
    }

    public abstract void doWork();

}
