package ru.job4j.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<>();
        data.put("job4j@yandex.ru", "Иванов Иван Иванович");
        data.put("job4j@gmail.ru", "Петров Петр Петрович");
        data.put("job4j@yandex.ru", "Сергеев Сергей Сергеевич");
        data.put("job4j@gmail.ru", "Дмитриев Дмитрий Дмитриевич");

        for (Map.Entry<String, String> entry : data.entrySet()) {
            String mail = entry.getKey();
            String fullName = entry.getValue();
            System.out.println(mail + " = " + fullName);
        }
    }
}
