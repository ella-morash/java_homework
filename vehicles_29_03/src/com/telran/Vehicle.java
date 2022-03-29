package com.telran;

import java.util.Arrays;

public abstract class Vehicle {
    private String number;
    private int year;
    private Vehicle[] vehicles;

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

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    @Override
    public abstract String toString();

    public abstract void goToRace();



    }



