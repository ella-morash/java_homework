package com.company.employees;

public class Employee implements Comparable<Employee>{
    /* есть класс Employee c полями id, name, age, salary. Сделать его comparable по id.
Создать дополнительные возможности сортирвоки по: зарплате, возрасту, имени а также возможность
сортирвоки по имени если возраст одинаковый. В решении использовать ArrayList. Написать тесты */
    private int id;
    private String name;
    private int age;
    private int salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}
