package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int a, int b, int c, int d) {
        return sum(a) + multiply(b) + minus(c) + divide(d);
    }

    public static void main(String[] args) {
        System.out.println(Calculator.sum(10));

        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.multiply(5));

        System.out.println(Calculator.minus(12));

        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.divide(15));

        Calculator all = new Calculator();
        System.out.println(all.sumAllOperation(10, 5, 12, 15));
    }

}
