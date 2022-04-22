package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String words =  "aaa BBBB dEfxc";
        System.out.println(transformString(words,new ToLowerCase()));

    }

    public static String transformString (String words,Mutation command) {
        var strings = words.split(" ");
        StringBuilder bd = new StringBuilder();
        for (String s:strings) {

                bd.append(command.transform(s)).append(' ');
                continue;


        }



        return bd.toString();
    }
}
