package com.telran;

import java.util.Arrays;

public abstract class Vehicle {
    private String number;
    private int year;

    public Vehicle(String number, int year) {
        this.number = number;
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }


    @Override
    public abstract String toString();

    public abstract void goToRace();



    }



