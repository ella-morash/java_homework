package com.company;

import com.company.homewrok_08_06.Person;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("word1", "word2", "word3", "word4");
        List<String> list2 = Arrays.asList("word3", "word4", "word1", "word2");
        List<String> list3 = Arrays.asList("word4", "word3", "word2", "word1");
        //System.out.println(isCyclic(list1,list3));
        List<Character> chars = Arrays.asList('a','b','c','c','a','a','a','f');
        System.out.println(removeAdjDuplicates(chars));
    }
    //Given a List . Implement a method that will remove all adjacent identical characters, leaving only one.
    //For example: {a,,b,c,c,b,a,a,a,f} -> {a,,b,c,a,f}
    public static List<Character> removeAdjDuplicates(List<Character> chars) {
        Stack<Character> stack = new Stack<>();
        stack.push(chars.get(0));
        for (int i = 1; i < chars.size(); i++) {
            char adjacent = stack.peek();
            if (chars.get(i).equals(adjacent)){
                continue;
            } else {
                stack.push(chars.get(i));
            }

        }


        return stack.stream().toList();
    }
    //Given a List of words. Implements the method that return
    // the Map where key is a word and the value is how many times the word appears in the list.

    public static Map<String,Integer> countWords(List<String> words) {
        Map<String,Integer> map = new HashMap<>();
        for (String word:words) {
            if (!map.containsKey(word)){
                map.put(word,1);
            } else {
                map.put(word, map.get(word)+1);
            }


        }
        return map;

    }
    //Given two lists of String.
    // Implement the method that returns a set of strings that are present in both lists.
    // Masha Petia Tania Dima Masha  ,   Masha Kolya Sasha Tania -> Masha Tania
    public static Set<String> getUniqueFromLists(List<String> list1,List<String> list2) {
        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);
        Set<String> toReturn = new HashSet<>();
        for (String str:set2) {
            if (set1.contains(str)) {
                toReturn.add(str);
            }

        }

        return toReturn;
    }
    //Given a List . Person has unique int id and name. All persons in the list except one are unique.
    // Implements the method that finds a non-unique Person in the list.
    // Implement this task by all ways you know and evaluate the time and space complexity of each way.

    //brutal force approach , time O(n^2), space O(1)
    public static Person findNonUnique(List<Person> persons) {
        Person nonUnique = null;
        for (int i = 0; i < persons.size() - 1; i++) {
            for (int j = i + 1; j < persons.size(); j++) {
                if (persons.get(i).equals(persons.get(j))) {
                    nonUnique=persons.get(i);
                    break;

                }

            }

        }
        return nonUnique;

    }
    // time O(n), space O(n)
    public static Person findNonUnique1(List<Person> persons) {
        Person nonUnique = null;
        Set<Person> setOfPersons = new HashSet<>(persons);
        for (Person p: persons) {
            if (!setOfPersons.add(p)) {
                nonUnique=p;
            }

        }
        return nonUnique;

    }
    // time O(logN), space O(1)
    public static Person findNonUnique2(List<Person> persons) {
        Person nonUnique = null;
        Collections.sort(persons);
        for (int i = 0; i < persons.size()-1; i++) {
            if (persons.get(i).equals(persons.get(i+1))) {
                nonUnique = persons.get(i);
            }

        }


        return nonUnique;

    }

    //Given two lists of String. Implement the method that checks
    // if one list is cyclic version of the other. For example:
    //{word1, word2, word3, word4} , { word3, word4, word1, word2} -> true
    //{word1, word2, word3, word4} , { word4, word3, word2, word1} -> false

    // time O(n),space O(n)
    public static boolean isCyclic(List<String> list1,List<String> list2) {
        if (list1.size()!=list2.size()) return false;

        Queue<String> queue1 = new LinkedList<>(list1);
        Queue<String> queue2 = new LinkedList<>(list2);

        for (int i = 0; i < list2.size(); i++) {
            String str = queue2.peek();
            queue2.remove();
            queue2.add(str);

            if (queue2.equals(queue1)) {
                return true;
            }


        }
        return false;

    }


}
