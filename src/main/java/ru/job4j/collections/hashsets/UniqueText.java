package ru.job4j.collections.hashsets;
import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String o : origin) {
            check.add(o);
        }

        for (String t : text) {
            rsl = rsl && check.contains(t);
        }
        return rsl;
    }
}
