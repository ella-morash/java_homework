package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String words =  "aaa BBBB dEfxc";
        System.out.println(transformString(words,5));

    }

    public static String transformString (String words,int lenToChange) {
        var strings = words.split(" ");
        StringBuilder bd = new StringBuilder();
        switch (lenToChange) {
            case(3):
                Mutation toUpperCase = new ToUpperCase();
                for (String s:strings) {
                    if (s.length()==3) {
                        bd.append(toUpperCase.transform(s)).append(' ');
                        continue;
                    }
                    bd.append(s).append(' ');

                }
                break;
            case(4):
                Mutation toLowerCase = new ToLowerCase();

                for (String s:strings) {
                    if (s.length()==4) {
                        bd.append(toLowerCase.transform(s)).append(' ');
                        continue;
                    }
                    bd.append(s).append(' ');

                }
                break;
            case(5):
                Mutation toAsterisks= new ToAsterisks();

                for (String s:strings) {
                    if (s.length()==5) {
                        bd.append(toAsterisks.transform(s)).append(' ');
                        continue;
                    }
                    bd.append(s).append(' ');

                }
                break;

        }


        return bd.toString();
    }
}
