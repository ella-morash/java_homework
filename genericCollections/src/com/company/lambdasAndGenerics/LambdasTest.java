package com.company.lambdasAndGenerics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LambdasTest {

    @Test
    void createListOfNamesFromPersons() {
        Person p1 = new Person("Alex","Turner","sddf@.de","097586584",
                new Address("12345","Berlin","Warschauer Strasse","56"));
        Person p2 = new Person("Olga","Muller","olgaf@.de","097586584",
                new Address("12345","Chemnitz","Warschauer Strasse","56"));
        Person p3 = new Person("Nata","Straus","nata@.de","097586584",
                new Address("12345","Hannover","Warschauer Strasse","56"));
        Person p4 = new Person("Inga","Heinz","singaf@.de","097586584",
                new Address("12345","New-York","Warschauer Strasse","56"));

        List<Person> personList = List.of(p1,p2,p3,p4);
        List<String> expected = List.of("Alex Turner","Olga Muller","Nata Straus","Inga Heinz");

        Assertions.assertEquals(expected,Main.createListFromPersons(personList,Person::getFullName));
    }

    @Test
    void createListOfEmailsFromPersons() {
        Person p1 = new Person("Alex","Turner","sddf@.de","097586584",
                new Address("12345","Berlin","Warschauer Strasse","56"));
        Person p2 = new Person("Olga","Muller","olgaf@.de","097586584",
                new Address("12345","Chemnitz","Warschauer Strasse","56"));
        Person p3 = new Person("Nata","Straus","nata@.de","097586584",
                new Address("12345","Hannover","Warschauer Strasse","56"));
        Person p4 = new Person("Inga","Heinz","singaf@.de","097586584",
                new Address("12345","New-York","Warschauer Strasse","56"));

        List<Person> personList = List.of(p1,p2,p3,p4);
        List<String> expected = List.of("sddf@.de","olgaf@.de","nata@.de","singaf@.de");

        Assertions.assertEquals(expected,Main.createListFromPersons(personList,Person::getEmail));
    }

    @Test
    void createListOfPhonesFromPersons() {
        Person p1 = new Person("Alex","Turner","sddf@.de","097586584",
                new Address("12345","Berlin","Warschauer Strasse","56"));
        Person p2 = new Person("Olga","Muller","olgaf@.de","097586584",
                new Address("12345","Chemnitz","Warschauer Strasse","56"));
        Person p3 = new Person("Nata","Straus","nata@.de","097586584",
                new Address("12345","Hannover","Warschauer Strasse","56"));
        Person p4 = new Person("Inga","Heinz","singaf@.de","097586584",
                new Address("12345","New-York","Warschauer Strasse","56"));

        List<Person> personList = List.of(p1,p2,p3,p4);
        List<String> expected = List.of("097586584","097586584","097586584","097586584");

        Assertions.assertEquals(expected,Main.createListFromPersons(personList,Person::getPhone));
    }

    @Test
    void createListOfAddressesFromPersons() {
        Person p1 = new Person("Alex","Turner","sddf@.de","097586584",
                new Address("12345","Berlin","Warschauer Strasse","56"));
        Person p2 = new Person("Olga","Muller","olgaf@.de","097586584",
                new Address("12345","Chemnitz","Warschauer Strasse","56"));
        Person p3 = new Person("Nata","Straus","nata@.de","097586584",
                new Address("12345","Hannover","Warschauer Strasse","56"));
        Person p4 = new Person("Inga","Heinz","singaf@.de","097586584",
                new Address("12345","New-York","Warschauer Strasse","56"));

        List<Person> personList = List.of(p1,p2,p3,p4);
        List<String> expected = List.of("12345 Berlin Warschauer Strasse 56", "12345 Chemnitz Warschauer Strasse 56" , "12345 Hannover Warschauer Strasse 56", "12345 New-York Warschauer Strasse 56");

        Assertions.assertEquals(expected,Main.createListFromPersons(personList,person ->
                person.getAddress().toString()));
    }

    @Test
    void createNewListOfAddressesGeneric() {
        Person p1 = new Person("Alex","Turner","sddf@.de","097586584",
                new Address("12345","Berlin","Warschauer Strasse","56"));
        Person p2 = new Person("Olga","Muller","olgaf@.de","097586584",
                new Address("12345","Chemnitz","Warschauer Strasse","56"));
        Person p3 = new Person("Nata","Straus","nata@.de","097586584",
                new Address("12345","Hannover","Warschauer Strasse","56"));
        Person p4 = new Person("Inga","Heinz","singaf@.de","097586584",
                new Address("12345","New-York","Warschauer Strasse","56"));

        List<Person> personList = List.of(p1,p2,p3,p4);
        List<String> expected = List.of("12345 Berlin Warschauer Strasse 56", "12345 Chemnitz Warschauer Strasse 56" , "12345 Hannover Warschauer Strasse 56", "12345 New-York Warschauer Strasse 56");

        Assertions.assertEquals(expected,Main.createNewListGeneric(personList,person ->
                person.getAddress().toString()));
    }
    @Test
    void createNewListOfLengthsGeneric() {
        List<String> stringList = List.of("eee","r","ssdsf");
        List<Integer> expected = List.of(3,1,5);
        Assertions.assertEquals(expected,Main.createNewListGeneric(stringList,String::length));
    }

    @Test
    void getMaxElIntegers() {
        List<Integer> numeric = List.of(1,2,5,4,3);
        Assertions.assertEquals(5,Main.getMaxEl(numeric));
    }
    @Test
    void getMaxElChars() {
        List<Character> chars = List.of('b','c','a');
        Assertions.assertEquals('c',Main.getMaxEl(chars));
    }
}