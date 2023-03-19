package ru.job4j.exception;

import java.util.Scanner;
import java.lang.Character;
public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }

        char[] passwordChar = password.toCharArray();
        boolean upper = true;
        boolean lower = true;
        boolean digit = true;
        boolean symbol = true;
        for (char word : passwordChar) {
            if (Character.isUpperCase(word)) {
                upper = false;
                continue;
            }
            if (Character.isLowerCase(word)) {
                lower = false;
                continue;
            }
            if (Character.isDigit(word)) {
                digit = false;
                continue;
            }
            if (!Character.isLetterOrDigit(word)) {
                symbol = false;
            }

        }
        if (upper) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (lower) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (digit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (symbol) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }

        String[] valid = {"qwerty", "12345", "password", "admin", "user"};
        for (int i = 0; i < valid.length; i++) {
            if (password.toLowerCase().contains(valid[i])) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String print = validate(scanner.nextLine());
        System.out.println(print);
    }
}
