package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Object> list2 = new ArrayList<>();
        System.out.println(copyList(list1, list2));
    }

    public static List<?> copyList(List<? extends Number> list1, List<? super Number> list2) {
        list1.forEach(el -> list2.add(el));
        return list2;
    }
}