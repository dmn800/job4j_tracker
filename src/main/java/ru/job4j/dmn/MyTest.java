package ru.job4j.dmn;
import java.util.Arrays;

public class MyTest {
 //   public static void main(String[] args) {
 //       String desc = "Job desc ";
 //       String fullDesc = desc.concat("from Moskow");
 //       System.out.println(desc);
 //       System.out.println(fullDesc);
 //       final StringBuilder buffer = new StringBuilder("Hello, ");
 //       buffer.append("world!");
 //       System.out.println(buffer);
 //   }
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int index = 0; index < middle; index++) {
            String temp = names[index];
            names[index] = names[middle - index];
            names[middle - index] = temp;
            System.out.println(names[index]);
        }
        System.out.println(Arrays.toString(names));
    }
}
