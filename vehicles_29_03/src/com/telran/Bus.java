package com.telran;

public class Bus extends Vehicle{
    private int maxAmountOfPassengers;

    public Bus(String number, int year, int maxAmountOfPassengers) {
        super(number, year);
        this.maxAmountOfPassengers = maxAmountOfPassengers;
    }

    public int getMaxAmountOfPassengers() {
        return maxAmountOfPassengers;
    }

    @Override
    public String toString() {
        return String.format("This is Bus %s of %d year. It can take %d passengers.",
                getNumber(),getYear(),maxAmountOfPassengers);
    }

    @Override
    public void goToRace() {
        System.out.printf("Bus %s got a ride with %d passengers",getNumber(),maxAmountOfPassengers);
    }
}
