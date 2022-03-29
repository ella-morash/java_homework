package com.telran;

public class Car extends Vehicle{
    private int loadCapacity;
    private int passengerCapacity;

    public Car(String number, int year, int loadCapacity, int passengerCapacity) {
        super(number, year);
        this.loadCapacity = loadCapacity;
        this.passengerCapacity = passengerCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public String toString() {
        return String.format("This is Car %s of %d year. It can take %d tons of load and %d passengers.",
                getNumber(),getYear(),loadCapacity,passengerCapacity);
    }

    @Override
    public void goToRace() {
        System.out.printf("Car %s got a ride with %d tons of load and %d passengers",
                getNumber(),loadCapacity,passengerCapacity);

    }
}
