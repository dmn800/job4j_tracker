package ru.job4j.exception;

public class Fact {
    public int calc(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N could not be less then 0");
        }
        int rsl = 1;
        for (int index = 2; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("Factorial for 3 is " + new Fact().calc(3));
    }
}
