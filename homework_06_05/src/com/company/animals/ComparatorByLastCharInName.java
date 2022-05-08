package com.company.animals;

import java.util.Comparator;

public class ComparatorByLastCharInName implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        char lastChar1 = a1.getName().charAt(a1.getName().length() - 1);
        char lastChar2 = a2.getName().charAt(a2.getName().length() - 1);
        if (Character.compare(lastChar1, lastChar2) == 0) {
            int minLength = Math.min(a1.getName().length() - 1, a2.getName().length() - 1);
            for (int i = minLength - 2; i >= 0; i--) {
                if (Character.compare(a1.getName().charAt(i), a2.getName().charAt(i)) == 0) {
                    continue;
                } else {
                    return Character.compare(lastChar1, lastChar2);
                }
            }

        }
        return Character.compare(lastChar1, lastChar2);
    }
}
