package com.company.generics;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class GenericsTest {

    @Test
    void copyListIntegerToObject(){
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Object> list2 = new ArrayList<>();

        List<Integer> expected = List.of(1, 2, 3, 4, 5);
        Assertions.assertEquals(expected,Main.copyList(list1,list2));

    }
    @Test
    void copyListIntegerToNumber(){
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Number> list2 = new ArrayList<>();

        List<Integer> expected = List.of(1, 2, 3, 4, 5);
        Assertions.assertEquals(expected,Main.copyList(list1,list2));

    }

    @Test
    void copyListDoubleToNumber(){
        List<Double> list1 = List.of(1.0, 2.1, 3.3, 4.7, 5.1);
        List<Number> list2 = new ArrayList<>();

        List<Double> expected = List.of(1.0, 2.1, 3.3, 4.7, 5.1);
        Assertions.assertEquals(expected,Main.copyList(list1,list2));

    }

    @Test
    void copyListDoubleToObject(){
        List<Double> list1 = List.of(1.0, 2.1, 3.3, 4.7, 5.1);
        List<Object> list2 = new ArrayList<>();

        List<Double> expected = List.of(1.0, 2.1, 3.3, 4.7, 5.1);
        Assertions.assertEquals(expected,Main.copyList(list1,list2));

    }

}
