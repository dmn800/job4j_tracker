package ru.job4j.exception;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String[] says = {"hello", "hi", "good morning"};
            indexOf(says, "hoi");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
