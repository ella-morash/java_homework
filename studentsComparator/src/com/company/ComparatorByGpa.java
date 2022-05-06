package com.company;

import java.util.Comparator;

public class ComparatorByGpa implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        if (o1.getGpa()>o2.getGpa()) return 1;
        if (o1.getGpa()<o2.getGpa()) return -1;
        return 0;
    }
}
