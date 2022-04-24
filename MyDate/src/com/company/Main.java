package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyDate date1 = new MyDate("2021-02-23");
        System.out.println(date1);
        MyDate date2 = new MyDate(25,3);
        System.out.println(date2.compareTo(date1));
        System.out.println(date1.getDifferenceBetweenDays(date2));
        System.out.println(MyDate.getDifferenceBetweenDays(date1,date2));
    }
}
