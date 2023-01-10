package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    private double fuelPrice = 40.10;
    private int capacity = 20;

    @Override
    public void drive() {
        System.out.println("Едем.");
    }

    @Override
    public void move() {
        System.out.println("Автобус двигается по скоростным трассам");
    }

    @Override
    public void getPassengers(int count) {
        System.out.println("Может взять: " + capacity + " пассажиров. Принято " + count);
    }

    @Override
    public double refuel(double fuel) {
        System.out.println("Заправлено " + fuel + " литров бензина.");
        return fuel * fuelPrice;
    }
}
