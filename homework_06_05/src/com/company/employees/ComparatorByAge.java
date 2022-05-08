package com.company.employees;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getAge()-o2.getAge()==0) {
           return o1.getName().compareTo(o2.getName());
        }
        return o1.getAge()-o2.getAge();
    }
}
