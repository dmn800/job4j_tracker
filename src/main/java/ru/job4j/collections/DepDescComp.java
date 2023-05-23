package ru.job4j.collections;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] left = o1.split("/", 2);
        String[] right = o2.split("/", 2);
        int result = right[0].compareTo(left[0]);
        return result != 0 ? result : o1.compareTo(o2);
    }
}
