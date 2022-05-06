package com.company;

public class Students {
    private String name;
    private int yearOfBirthday;
    private double gpa;

    public Students(String name, int yearOfBirthday, double gpa) {
        this.name = name;
        this.yearOfBirthday = yearOfBirthday;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", yearOfBirthday=" + yearOfBirthday +
                ", gpa=" + gpa +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public double getGpa() {
        return gpa;
    }
}
