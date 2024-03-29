package ru.job4j.collections.sort;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftSplit = left.split(". ");
        String[] rightSplit = right.split(". ");
        int leftInt = Integer.parseInt(leftSplit[0]);
        int rightInt = Integer.parseInt(rightSplit[0]);
        return Integer.compare(leftInt, rightInt);
    }
}
