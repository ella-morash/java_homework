package com.telran;

import java.util.Arrays;

public class ParkStation {
    private Vehicle[] vehicles;


    public Vehicle[] getVehicles() {
        return vehicles;
    }


    public void addVehicle(Vehicle v) {
        if (this.vehicles == null) {
            this.vehicles = new Vehicle[8];
        }
        if (vehicles[vehicles.length - 1] != null) {
            var extendedVehicles = Arrays.copyOf(vehicles, vehicles.length * 2);
            this.vehicles = extendedVehicles;
        }

        for (int i = 0; i < this.vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = v;
                break;

            }

        }
    }

}

