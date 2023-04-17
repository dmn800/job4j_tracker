package ru.job4j.collections;
import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] elements : list) {
            for (int num : elements) {
                rsl.add(num);
            }
        }
        return rsl;
    }
}
