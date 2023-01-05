package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 1000);
        Book book2 = new Book("Цветы для Элджернона", 500);
        Book book3 = new Book("ГП. Орден Феникса", 700);
        Book book4 = new Book("Эгоистичный ген", 1500);
        Book[] books = new Book[]{book1, book2, book3, book4};
        Book.print(books);
        Book tempBook = books[3];
        books[3] = books[0];
        books[0] = tempBook;
        System.out.println();
        Book.print(books);
        System.out.println();
        Book.print(books, "Clean code");
    }
}
