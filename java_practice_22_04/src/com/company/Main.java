package com.company;


import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String words =  "aaa BBBB dEfxc";
//        System.out.println(transformString(words,new ToUpperCase()));
//
//        String word = "abbbcc";
//        System.out.println(findMaxLength(word));

    }

    public static int findMaxLength(String word) {
        HashMap<Character,Integer> map = new HashMap<>();
        int len = 1;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (map.containsKey(c)) {
                map.put(c,len++);
            } else {
                map.put(c,len);
            }
        }
        return  Collections.max(map.values());

    }

    public static String transformString (String words,Mutation command) {
        var strings = words.split(" ");
        StringBuilder bd = new StringBuilder();
        for (String s:strings) {

                bd.append(command.transform(s)).append(" ");
        }
        return bd.toString().trim();
    }
}
