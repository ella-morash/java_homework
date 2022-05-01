package com.company;

import java.util.Arrays;

public class MyDateList {

    private MyDate[] myDates;
    private int capacity = 8;
    private int currentInx = 0;

    public MyDateList(int capacity) {
        this.capacity = capacity;
    }

    public MyDateList() {
    }

    public void add(MyDate date) {
        if (myDates == null) {
            myDates = new MyDate[capacity];
            currentInx = 0;
        }
        if (date != null) {
            myDates[currentInx++] = date;

            if (currentInx >= capacity) {

                myDates = Arrays.copyOf(myDates, capacity * 2);
            }
        }
    }

    public MyDate[] selectionSort() {
        if (currentInx == 0) return new MyDate[]{};
        myDates = Arrays.copyOf(myDates,currentInx);


        int start = 0;
        while (start < myDates.length - 1) {
            int indexOfSmallest = start;
            for (int i = start + 1; i < myDates.length; i++) {


                if (myDates[indexOfSmallest].compareTo(myDates[i]) > 0) {
                    indexOfSmallest = i;

                }

            }
            swap(start, indexOfSmallest, myDates);
            start++;

        }

        return myDates;

    }

    private void swap(int i, int j, MyDate[] array) {
        MyDate temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
