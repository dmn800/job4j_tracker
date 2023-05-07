package ru.job4j.collections.sort;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        int n = o2.length();
        if (o1.length() < o2.length()) {
           n = o1.length();
        }
        for (int i = 0; i < n; i++) {
            int left = o1.charAt(i);
            int right = o2.charAt(i);
            int compare = Integer.compare(left, right);
            if (compare != 0) {
                rsl = compare;
                break;
            } else {
                rsl = o1.length() - o2.length();
            }
        }
        return rsl;
    }
}
