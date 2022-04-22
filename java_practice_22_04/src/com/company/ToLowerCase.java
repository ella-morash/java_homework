package com.company;

import java.util.Locale;

public class ToLowerCase extends Mutation{


    @Override
    public String transform(String word) {
        return word.toLowerCase();
    }
}
