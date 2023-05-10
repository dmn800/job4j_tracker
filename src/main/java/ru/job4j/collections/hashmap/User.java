package ru.job4j.collections.hashmap;

import java.util.Objects;

/**
 * Класс для описания модели пользователя банка
 * Модель содержит поля: номер паспорта и ФИО пользователя
 * @author DMITRIY NEFEDEV
 * @version 1.0
 */
public class User {
    /**
     * Номер паспорта пользователя (идентификатор пользователя)
     */
    private String passport;
    /**
     * ФИО пользователя
     */
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    @Override
    public String toString() {
        return "User{"
                + "passport='" + passport + '\''
                + ", username='" + username + '\''
                + '}';
    }
}
