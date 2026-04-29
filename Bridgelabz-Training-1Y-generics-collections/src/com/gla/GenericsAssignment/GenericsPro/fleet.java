package com.gla.GenericsAssignment.GenericsPro;

import java.util.*;

class Vehicle {}

class Truck extends Vehicle {}
class Bike extends Vehicle {}

class FleetManager<T extends Vehicle> {
    List<T> vehicles = new ArrayList<>();

    void addVehicle(T vehicle){
        vehicles.add(vehicle);
    }

    void showFleet(){
        for(T v : vehicles){
            System.out.println(v.getClass().getSimpleName());
        }
    }
}

class fleet {
    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck());

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike());

        truckFleet.showFleet();
        bikeFleet.showFleet();
    }
}
