package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;


public class MyDate implements Comparable<MyDate> {
    private int day;
    private int month;
    private int year;



    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(int day, int month) {
        this.day = day;
        this.month = month;
        this.year = 2022;
    }



    public MyDate(String date) {
        String[] parseDate = date.split("-");
        this.year = Integer.parseInt(parseDate[0]);
        this.month = Integer.parseInt(parseDate[1]);
        this.day = Integer.parseInt(parseDate[2]);
    }


    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public int compareTo(MyDate anotherDate) {
        int difference = this.year - anotherDate.year;

        if (difference != 0) {
            return difference;
        }

        difference = this.month - anotherDate.month;

        if (difference != 0) {
            return difference;
        }

        return this.day - anotherDate.day;
    }

    public int compareTo1(MyDate anotherDate) {
        if (this.year != anotherDate.year) {
            return this.year - anotherDate.year;
        } else if (this.month != anotherDate.month) {
            return this.month - anotherDate.month;
        } else {
            return this.day - anotherDate.day;
        }

    }

    public long getDifferenceBetweenDays(MyDate date) {
        LocalDate thisDate = LocalDate.of(this.year, this.month, this.day);
        LocalDate dateToCompareWith = LocalDate.of(date.year, date.month, date.day);
        return ChronoUnit.DAYS.between(thisDate, dateToCompareWith);
    }

    public static long getDifferenceBetweenDays(MyDate date1, MyDate date2) {
        LocalDate first = LocalDate.of(date1.year, date1.month, date1.day);
        LocalDate second = LocalDate.of(date2.year, date2.month, date2.day);
        return ChronoUnit.DAYS.between(first, second);
    }
}

