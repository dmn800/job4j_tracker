package ru.job4j.collections.sort;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        int n = Math.min(o1.length(), o2.length());
        for (int i = 0; i < n; i++) {
            char left = o1.charAt(i);
            char right = o2.charAt(i);
            rsl = Character.compare(left, right);
            if (rsl != 0) {
                break;
            }
        }
        return rsl == 0 ? o1.length() - o2.length() : rsl;
    }
}
