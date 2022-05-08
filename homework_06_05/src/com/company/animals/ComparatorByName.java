package com.company.animals;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getName().compareTo(a2.getName());
    }
}
