package ru.job4j.collections.hashsets;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account account : accounts) {
            rsl.add(account);
        }
        return rsl;
    }
}
