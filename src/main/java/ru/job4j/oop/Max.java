package ru.job4j.oop;

public class Max {
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        return max(first, second) > third ? max(first, second) : third;
    }
}