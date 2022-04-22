package com.company;

public class ToAsterisks extends Mutation{

    @Override
    public String transform(String word) {
        StringBuilder bd = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
           bd.append(word.charAt(i));
           bd.setCharAt(i,'*');

        }
        return bd.toString();
    }
}
