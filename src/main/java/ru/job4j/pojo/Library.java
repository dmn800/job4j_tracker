package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Сборник стихов", 200);
        Book book2 = new Book("Преуступление и наказание", 300);
        Book book3 = new Book("Война и мир", 500);
        Book book4 = new Book("Энциклопедия", 1000);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        book1.setName("Clean Code");
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
            if (books[i].getName().equals("Clean Code")) {
                System.out.println(books[i].getName());
            }
        }
    }
}
