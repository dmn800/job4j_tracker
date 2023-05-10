package ru.job4j.collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс для описания сервиса обслуживания клиентов банка
 * Банковский перевод
 * @author DMITRIY NEFEDEV
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение всех пользователей системы с привязанными к ним счетами в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавление пользователя в систему с нулевым списком банковских счетом ArrayList
     * @param user Пользователь в качестве key
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Удаление пользователя из системы
     * @param passport удаление по паспортным данным
     * @return возвращает true в случае успешного удаления пользователя
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, " ")) != null;
    }

    /**
     *Добавление нового счета к пользователю
     * @param passport указываем номер паспорта для поиска пользователя
     * @param account добавляем новый счет
     */
    public void addAccount(String passport, Account account) {
        User find = findByPassport(passport);
        if (find != null) {
            List<Account> accounts = users.get(find);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Поиск пользователя по номеру паспорта
     * @param passport вводим номер паспорта для поиска
     * @return возвращает пользователя, если находит, либо возвращает null
     */
    public User findByPassport(String passport) {
        User user = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = key;
                break;
            }
        }
        return user;
    }

    /**
     * Поиск счета у конкретного пользователя банка
     * @param passport вводим номер паспорта
     * @param requisite вводим реквизиты счета
     * @return получаем банковский счет
     */
    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User find = findByPassport(passport);
        if (find != null) {
            List<Account> accounts = users.get(find);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    result = account;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Банковский перевод
     * @param srcPassport паспорт пользователя-отправителя
     * @param srcRequisite счет пользоваттеля-отправителя
     * @param destPassport паспорт пользователя-получателя
     * @param destRequisite счет пользователя-получателя
     * @param amount сумма для перевода
     * @return возвращает true если перевод успешный
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite,
                                 double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Вывод всех счетов пользователя в виде списка List
     * @param user ввод пользователя
     * @return вывод списка счетов пользователя
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}