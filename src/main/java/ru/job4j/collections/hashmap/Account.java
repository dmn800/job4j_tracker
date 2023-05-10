package ru.job4j.collections.hashmap;

import java.util.Objects;

/**
 * Класс для описания модели банковского счета
 * Модель содержит поля: реквизиты счета и его баланс
 * @author DMITRIY NEFEDEV
 * @version 1.0
 */
public class Account {
    /**
     * Номер лицевого счета пользователя
     */
    private String requisite;
    /**
     * Текущий баланс на лицевом счете пользователя
     */
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }

    @Override
    public String toString() {
        return "Account{"
                + "requisite='" + requisite + '\''
                + ", balance=" + balance
                + '}';
    }
}
