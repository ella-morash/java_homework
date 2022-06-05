package com.company;


import com.company.homewrok_08_06.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class MainTest {
    Person person;



    @Test
    void removeDuplicates() {
        List<Character> characters = Arrays.asList('a','a','b','c','c');
        List<Character> expected = Arrays.asList('a','b','c');
       // Assertions.assertEquals(expected,Main.removeDuplicates(characters));

    }

    @Test
    void countWords() {
        List<String> words = Arrays.asList("Katia","Sweta","Alex","Lena","Lena","Alex");
        Map<String,Integer> expected = new HashMap<>();
        expected.put("Katia",1);
        expected.put("Sweta",1);
        expected.put("Alex",2);
        expected.put("Lena",2);
        Assertions.assertEquals(expected,Main.countWords(words));

    }

    @Test
    void getUniqueFromLists() {
        List<String> list1 = Arrays.asList("Katia","Sweta","Alex","Lena","Lena","Alex");
        List<String> list2 = Arrays.asList("Katia","Sweta","Igor","Stepa","Nata","Alex");
        Set<String> expected = Set.of("Katia","Sweta","Alex");
        Assertions.assertEquals(expected,Main.getUniqueFromLists(list1,list2));

    }

    @Test
    void findNonUniqueBruteForceApproach() {
        List<Person> persons = Arrays.asList(new Person(1,"Alex"),new Person(3,"Regina"),
                new Person(5,"Gleb"),new Person(1,"Alex"));

        Person expected = new Person(1,"Alex");
        Assertions.assertEquals(expected,Main.findNonUnique(persons));

    }

    @Test
    void findNonUniqueUsingSet() {
        List<Person> persons = Arrays.asList(new Person(1,"Alex"),new Person(3,"Regina"),
                new Person(5,"Gleb"),new Person(1,"Alex"));

        Person expected = new Person(1,"Alex");
        Assertions.assertEquals(expected,Main.findNonUnique1(persons));

    }
    @Test
    void findNonUniqueBySorting() {
        List<Person> persons = Arrays.asList(new Person(1,"Alex"),new Person(3,"Regina"),
                new Person(5,"Gleb"),new Person(5,"Gleb"));

        Person expected = new Person(5,"Gleb");
        Assertions.assertEquals(expected,Main.findNonUnique2(persons));

    }

    @Test
    void isCyclingSuccess() {
        List<String> list1 = Arrays.asList("word1", "word2", "word3", "word4");
        List<String> list2 = Arrays.asList("word3", "word4", "word1", "word2");
        Assertions.assertTrue(Main.isCyclic(list1,list2));

    }
    @Test
    void isCyclingFailure() {
        List<String> list1 = Arrays.asList("word1", "word2", "word3", "word4");
        List<String> list3 = Arrays.asList("word4", "word3", "word2", "word1");
        Assertions.assertFalse(Main.isCyclic(list1,list3));

    }

}