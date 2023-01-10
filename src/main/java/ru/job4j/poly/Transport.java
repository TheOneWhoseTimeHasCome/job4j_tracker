package ru.job4j.poly;

public interface Transport {
    /**
     * ехать (без параметров, без возвращаемого типа),
     * пассажиры (принимает число пассажиров, без возвращаемого типа),
     * заправить (принимает кол-во топлива, возвращает цену).
     **/
    void drive();

    void getPassengers(int count);

    double refuel(double fuel);
}
