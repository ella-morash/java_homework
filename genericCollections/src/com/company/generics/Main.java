package com.company.generics;

import java.util.List;

public class Main {
    public static void main(String[] args) {


    }

    public static <T> List<?> copyList(List<? extends T> list1, List<? super T> list2) {
        list2.addAll(list1);
        return list2;
    }
}
