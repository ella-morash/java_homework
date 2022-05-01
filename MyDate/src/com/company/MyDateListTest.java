package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class MyDateListTest {
    MyDate myDate1;
    MyDate myDate2;
    MyDate myDate3;
    MyDateList dates;


    @BeforeEach
    void init(){
        myDate1 = new MyDate(23,02);
        myDate2 = new MyDate(18,02,1993);
        myDate3 = new MyDate(4,3,2021);
        dates = new MyDateList(5);
        dates.add(myDate1);
        dates.add(myDate2);
        dates.add(myDate3);


    }
    @Test
    void sortArrayWithThreeDates() {
        MyDate[] expected = new MyDate[] {myDate2,myDate3,myDate1};
        Assertions.assertEquals(Arrays.toString(expected),Arrays.toString(dates.selectionSort()));

    }
    @Test
    void sortArrayWithOneDate() {
        MyDate[] expected = new MyDate[] {myDate2};
        dates = new MyDateList(5);
        dates.add(myDate2);
        Assertions.assertEquals(Arrays.toString(expected),Arrays.toString(dates.selectionSort()));

    }

    @Test
    void sortEmptyArray() {
        MyDate[] expected = new MyDate[] {};
        dates = new MyDateList();
        Assertions.assertEquals(Arrays.toString(expected),Arrays.toString(dates.selectionSort()));

    }
    



}