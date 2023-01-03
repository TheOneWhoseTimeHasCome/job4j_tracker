package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println("sum " + result);
        System.out.println("multiply " + new Calculator().multiply(5));
        System.out.println("minus " + minus(70));
        System.out.println("divide " + new Calculator().divide(2));
        System.out.println("sumAllOperation " + new Calculator().sumAllOperation(4));
    }
}