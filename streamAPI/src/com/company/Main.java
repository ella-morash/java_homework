package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String,Person> map = new HashMap<>();
        map.put("alo@.com",new Person("Alo","alo@.com",12));
        map.put("aho@.com",new Person("Aho","aho@.com",16));
        map.put("ano@.com",new Person("Ano","ano@.com",18));
        map.put("axo@.com",new Person("Ano","alo@.com",35));
        map.put("ato@.com",new Person("Ano","alo@.com",25));
        map.put("azo@.com",new Person("Ano","alo@.com",28));
        map.put("apo@.com",new Person("Ano","alo@.com",15));
        map.put("aro@.com",new Person("Ano","alo@.com",19));
        map.put("aqo@.com",new Person("Ano","alo@.com",20));
        map.put("amo@.com",new Person("Ano","alo@.com",18));

        //System.out.println(hasRelatedValue(map));
        //System.out.println(getTenUsersByAge(map,18,27));

        List<Double> list = List.of(1.2,1.5,1.8,3.3);
        System.out.println(findClosestValue(list,3));
    }

    //Дан map<email, Person>. Необходимо проверить, что для всех записей email указанный в ключе соответствует email указанный у user-a
    public static boolean hasEqualRelatedValue (Map<String,Person> map) {

        List<Map.Entry<String,Person>> list = map.entrySet().stream()
                                                            .filter(e -> e.getKey().equals(e.getValue().getEmail()))
                                                            .toList();

        return map.size()== list.size();


    }

    //Дан map<email, Person>. Необходимо сформировать список email-ов десяти уникальных пользователей, чей возраст попадает в заданный интервал.
    public static List<String> getTenUsersByAge(Map<String,Person> map, int min,int max) {

        List<String> emails = map.entrySet().stream()
                                            .filter(e->e.getValue().getAge()>min && e.getValue().getAge()<max)
                                            .map(Map.Entry::getKey)
                                            .distinct() // Why do we have to call this method on stream if initially map by default has unique keys?
                                            .limit(10)
                                            .toList();

        return emails;
    }


    //Дан List<Double>. Необходимо найти значение элемента максимально близкого к некоторому заданному значению N.

    public static double findClosestValue(List<Double> list, int N) {

        return list.stream()
                   .min(Comparator.comparing(d->Math.abs(d - N)))
                   .orElseThrow(()->new NoSuchElementException("No element present!"));

    }
}

class Person{
    private String name;
    private String email;
    private int age;

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, age);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
