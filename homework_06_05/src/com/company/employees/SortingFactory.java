package com.company.employees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingFactory {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Alex",30,2500);
        Employee employee2 = new Employee(5,"John",25,2300);
        Employee employee3 = new Employee(2,"Ingrid",30,1800);
        Employee employee4 = new Employee(3,"Max",24,1200);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        Collections.sort(employees);
        System.out.println(employees);
        Collections.sort(employees,new ComparatorByName());
        System.out.println(employees);
        Collections.sort(employees,new ComparatorBySalary());
        System.out.println(employees);
        Collections.sort(employees,new ComparatorByAge());
        System.out.println(employees);
    }
}
