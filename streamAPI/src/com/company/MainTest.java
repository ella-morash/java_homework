package com.company;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MainTest {

    @Test
    void testHasEqualValueSuccess() {
        Map<String,Person> map = new HashMap<>();
        map.put("alo@.com",new Person("Alo","alo@.com",12));
        map.put("aho@.com",new Person("Aho","aho@.com",16));
        map.put("ano@.com",new Person("Ano","ano@.com",18));

        Assertions.assertTrue(Main.hasEqualRelatedValue(map));

    }

    @Test
    void testHasEqualValueFailure() {
        Map<String,Person> map = new HashMap<>();
        map.put("alo@.com",new Person("Alo","alo@.com",12));
        map.put("aho@.com",new Person("Aho","aho@.com",16));
        map.put("ano@.com",new Person("Ano","ao@.com",18));

        Assertions.assertFalse(Main.hasEqualRelatedValue(map));

    }
    @Test
    void testGet10UsersByAge() {
        Map<String,Person> map = new HashMap<>();
        map.put("alo@.com",new Person("Alo","alo@.com",12));
        map.put("aho@.com",new Person("Aho","aho@.com",16));
        map.put("ano@.com",new Person("Ano","ano@.com",18));
        map.put("axo@.com",new Person("Ano","alo@.com",35));
        map.put("ato@.com",new Person("Ano","alo@.com",25));
        map.put("azo@.com",new Person("Ano","alo@.com",28));
        map.put("apo@.com",new Person("Ano","alo@.com",15));
        int min = 15;
        int max = 27;

        List<String> expected = List.of("ano@.com","aho@.com","ato@.com");
        Assertions.assertEquals(expected,Main.getTenUsersByAge(map,15,27));

    }

    @Test
    void testClosestValueLowerBound(){
        List<Double> list = List.of(1.2,1.5,1.8,3.3);
        Assertions.assertEquals(3.3,Main.findClosestValue(list,3));

    }
    @Test
    void testClosestValueUpperBound(){
        List<Double> list = List.of(1.2,1.5,1.8,3.3);
        Assertions.assertEquals(1.8,Main.findClosestValue(list,2));

    }

}