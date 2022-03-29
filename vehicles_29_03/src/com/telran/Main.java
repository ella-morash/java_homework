package com.telran;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ParkStation parkStation = new ParkStation();
        Vehicle bus = new Bus("M234", 2005, 20);
        Vehicle truck = new Truck("N433", 2002, 5);
        Vehicle car = new Car("H976", 1998, 2, 4);

        parkStation.addVehicle(bus);
        parkStation.addVehicle(truck);
        parkStation.addVehicle(car);


        for (Vehicle v : parkStation.getVehicles()) {
            if (v == null) {
                break;
            }
            v.goToRace();
            System.out.println();
        }
    }
}
