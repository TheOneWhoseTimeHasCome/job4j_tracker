package ru.job4j.poly;

public class Airbus implements Vehicle {
    private int capacity = 100;

    @Override
    public void move() {
        System.out.println("Самолет летает по воздуху");
    }

    @Override
    public void getPassengers(int count) {
        System.out.println("Может взять: " + capacity + " пассажиров. Принято " + count);
    }
}
