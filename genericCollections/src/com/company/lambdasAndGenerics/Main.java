package com.company.lambdasAndGenerics;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alex","Turner","sddf@.de","097586584",
                new Address("12345","Berlin","Warschauer Strasse","56"));
        Person p2 = new Person("Olga","Muller","olgaf@.de","097586584",
                new Address("12345","Chemnitz","Warschauer Strasse","56"));
        Person p3 = new Person("Nata","Straus","nata@.de","097586584",
                new Address("12345","Hannover","Warschauer Strasse","56"));
        Person p4 = new Person("Inga","Heinz","singaf@.de","097586584",
                new Address("12345","New-York","Warschauer Strasse","56"));

        List<Person> personList = List.of(p1,p2,p3,p4);




        List<String> names = createListFromPersons(personList, Person::getFullName);
        List<String> emails = createListFromPersons(personList, Person::getEmail);
        List<String> phones = createListFromPersons(personList, Person::getPhone);
        List<String> addresses = createListFromPersons(personList,person -> person.getAddress().toString());

//        System.out.println(names);
//        System.out.println(emails);
//        System.out.println(phones);
       System.out.println(addresses);
        List<String> addressesGeneric = createNewListGeneric(personList,p -> p.getAddress().toString());
        List<Integer> lengths = createNewListGeneric(emails, String::length);
        System.out.println(lengths);

        List<Integer> numeric = List.of(1,2,5,4,3);
        List<Character> chars = List.of('b','c','a');
        //System.out.println(getMaxEl(numeric));



    }

    public static List<String> createListFromPersons(List<Person> personList,
                                                     MyPersonFunction<Person,String> func) {
        List<String> newList = new ArrayList<>();

        personList.forEach(person -> newList.add((String) func.apply(person)));

        return newList;

    }
    /*
2)*Решить задачу №1 в общем виде: т.е. есть список объектов типа A
необходимо получить список объектов типа B.
Проверить, получив из листа Person лист объектов Address, из листа String лист Integer с длинами строк. */

    public static <T,R> List<R> createNewListGeneric (List<T> t, MyFunction<T,R> myFunction) {
        List<R> newList = new ArrayList<>();


        for (T o: t) {
            newList.add((R) myFunction.apply(o));

        }

        return newList;
    }
    /* 3)Реализовать обобщенный метод, который принимает любую коллекцию и возвращает максимальный элемент из этой коллекции.*/

    public static <T extends Comparable> T getMaxEl(List<T> list) {
        T max = list.get(0);
        for (T el:list) {
            if (el.compareTo(max) > 0) {
                max = el;
            }

        }
        return max;

    }
}
