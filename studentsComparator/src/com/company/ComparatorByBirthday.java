package com.company;

import java.util.Comparator;

public class ComparatorByBirthday implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getYearOfBirthday() - o2.getYearOfBirthday();
    }
}
