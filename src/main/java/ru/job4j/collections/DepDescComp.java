package ru.job4j.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        List<String> left = Arrays.asList(o1.split("/", 2));
        List<String> right = Arrays.asList(o2.split("/", 2));
        return left.get(0).equals(right.get(0)) ? o1.compareTo(o2) : right.get(0).compareTo(left.get(0));
    }
}
