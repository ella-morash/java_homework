package com.company;

import java.util.Comparator;

public class ComparatorByGpa implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGpa()>o2.getGpa()) return 1;
        if (o1.getGpa()<o2.getGpa()) return -1;
        return 0;
    }
}
