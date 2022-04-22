package com.company;

import java.util.Locale;

public class ToLowerCase extends Mutation{


    @Override
    public String transform(String word) {
        if (word.length()==4){
            return word.toLowerCase();
        }

        return word;

    }
}
