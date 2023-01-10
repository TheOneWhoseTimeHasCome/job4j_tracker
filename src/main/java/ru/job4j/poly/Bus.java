package ru.job4j.poly;

public class Bus implements Transport {
    private double fuelPrice = 40.10;

    @Override
    public void drive() {
        System.out.println("Едем.");
    }

    @Override
    public void getPassengers(int count) {
        System.out.println("Принято " + count + " пассажиров.");
    }

    @Override
    public double refuel(double fuel) {
        System.out.println("Заправлено " + fuel + " литров бензина.");
        return fuel * fuelPrice;
    }
}
