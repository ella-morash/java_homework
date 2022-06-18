package com.company.lambdasAndGenerics;

@FunctionalInterface
public interface MyPersonFunction<Person,String> {
    String apply(Person person);
}
