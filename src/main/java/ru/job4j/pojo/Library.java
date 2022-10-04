package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Сборник стихов", 200);
        books[1] = new Book("Преуступление и наказание", 300);
        books[2] = new Book("Война и мир", 500);
        books[3] = new Book("Энциклопедия", 1000);
        books[0].setName("Clean Code");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }
        System.out.println("");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }
        System.out.println("");
        for (int i = 0; i < books.length; i++) {
            if ("Clean Code".equals(books[i].getName())) {
                System.out.println(books[i].getName());
            }
        }
    }
}
