package com.company.employees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class SortingFactoryTest {

    @Test
    void sortById() {
        Employee employee1 = new Employee(1,"Alex",30,2500);
        Employee employee2 = new Employee(5,"John",25,2300);
        Employee employee3 = new Employee(2,"Ingrid",30,1800);
        Employee employee4 = new Employee(3,"Max",24,1200);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        Employee[] expected = {employee1,employee3,employee4,employee2};
        Collections.sort(employees);
        Assertions.assertArrayEquals(expected,employees.toArray());

    }

    @Test
    void sortByName() {
        Employee employee1 = new Employee(1,"Alex",30,2500);
        Employee employee2 = new Employee(5,"John",25,2300);
        Employee employee3 = new Employee(2,"Ingrid",30,1800);
        Employee employee4 = new Employee(3,"Max",24,1200);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        Employee[] expected = {employee1,employee3,employee2,employee4};
        Collections.sort(employees,new ComparatorByName());
        Assertions.assertArrayEquals(expected,employees.toArray());

    }
    @Test
    void sortByAge() {
        Employee employee1 = new Employee(1,"Alex",30,2500);
        Employee employee2 = new Employee(5,"John",25,2300);
        Employee employee3 = new Employee(2,"Ingrid",30,1800);
        Employee employee4 = new Employee(3,"Max",24,1200);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        Employee[] expected = {employee4,employee2,employee1,employee3};
        Collections.sort(employees,new ComparatorByAge());
        Assertions.assertArrayEquals(expected,employees.toArray());

    }
    @Test
    void sortBySalary() {
        Employee employee1 = new Employee(1,"Alex",30,2500);
        Employee employee2 = new Employee(5,"John",25,2300);
        Employee employee3 = new Employee(2,"Ingrid",30,1800);
        Employee employee4 = new Employee(3,"Max",24,1200);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        Employee[] expected = {employee4,employee3,employee2,employee1};
        Collections.sort(employees,new ComparatorBySalary());
        Assertions.assertArrayEquals(expected,employees.toArray());

    }

}