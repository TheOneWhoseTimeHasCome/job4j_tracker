package ru.job4j.poly;

import org.checkerframework.checker.units.qual.A;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle airbus = new Airbus();
        Vehicle[] vehicles = new Vehicle[]{bus, train, airbus};
        for (Vehicle v : vehicles) {
            v.move();
            v.getPassengers(10);
            System.out.println("----------------------");
        }
    }
}
