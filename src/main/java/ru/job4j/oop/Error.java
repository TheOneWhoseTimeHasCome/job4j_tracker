package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Наличие ошибки: " + this.active);
        System.out.println("Статус ошибки: " + this.status);
        System.out.println("Дополнительная информация: " + this.message);
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 35, "Что-то случилось");
        Error error3 = new Error(false, 1, "Все ок");
        Error error4 = new Error(true, 404, "Все пропало");
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
        error4.printInfo();
    }
}
