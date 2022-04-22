package com.company;

public class ToUpperCase extends Mutation{



    @Override
    public String transform(String word) {
        if (word.length() == 3) {
            return word.toUpperCase();
        }

        return word;

    }
}
