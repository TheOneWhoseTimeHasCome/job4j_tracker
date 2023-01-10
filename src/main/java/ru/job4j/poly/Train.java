package ru.job4j.poly;

public class Train implements Vehicle {
    private int capacity = 200;

    @Override
    public void move() {
        System.out.println("Поезд ездит по рельсам");
    }

    @Override
    public void getPassengers(int count) {
        System.out.println("Может взять " + capacity + " пассажиров. Взято: " + count);
    }
}
