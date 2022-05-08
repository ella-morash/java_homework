package com.company.animals;

import java.util.Comparator;

public class ComparatorByWeight implements Comparator<Animal> {
    @Override
    public int compare(Animal p1, Animal p2) {
        if (Double.compare(p1.getWeight(),p2.getWeight())>0) return 1;
        if (Double.compare(p1.getWeight(),p2.getWeight())<0) return -1;
        return 0;
    }
}
