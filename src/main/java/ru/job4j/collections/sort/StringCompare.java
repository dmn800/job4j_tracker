package ru.job4j.collections.sort;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        int n = Math.min(o1.length(), o2.length());
        for (int i = 0; i < n; i++) {
            rsl = Character.compare(o1.charAt(i), o2.charAt(i));
            if (rsl != 0) {
                break;
            }
        }
        return rsl == 0 ? Integer.compare(o1.length(), o2.length())  : rsl;
    }
}
