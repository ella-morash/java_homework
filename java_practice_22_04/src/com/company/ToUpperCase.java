package com.company;

public class ToUpperCase extends Mutation{



    @Override
    public String transform(String word) {
        return word.toUpperCase();
    }


}
