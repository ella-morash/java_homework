package com.telran;

public class Truck extends Vehicle{
    private int maxLoad;

    public Truck(String number, int year, int maxLoad) {
        super(number, year);
        this.maxLoad = maxLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    @Override
    public String toString() {
        return String.format("This is Truck %s of %d year. It can take %d tons of load.",
                getNumber(),getYear(),maxLoad);
    }

    @Override
    public void goToRace() {
        System.out.printf("Truck %s got a ride with %d tons of load",getNumber(),maxLoad);
    }
}
