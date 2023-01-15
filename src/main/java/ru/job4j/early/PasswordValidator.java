package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                break;
            }
            if (i == password.length() - 1 && !Character.isUpperCase((password.charAt(password.length() - 1)))) {
                throw new IllegalArgumentException("Password should contain at least one uppercase letter");
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                break;
            }
            if (i == password.length() - 1 && !Character.isLowerCase((password.charAt(password.length() - 1)))) {
                throw new IllegalArgumentException("Password should contain at least one lowercase letter");
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                break;
            }
            if (i == password.length() - 1 && !Character.isDigit((password.charAt(password.length() - 1)))) {
                throw new IllegalArgumentException("Password should contain at least one figure");
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                break;
            }
            if (i == password.length() - 1
                    && Character.isLetterOrDigit((password.charAt(password.length() - 1)))) {
                throw new IllegalArgumentException("Password should contain at least one special symbol");
            }
        }
        String[] words = {"qwerty", "12345", "password", "admin", "user"};
        String sub = "";
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].length() <= password.length() - i) {
                    sub = password.substring(i, i + words[j].length());
                } else {
                    continue;
                }
                if (sub.equalsIgnoreCase(words[j])) {
                    throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
                }
            }
        }
        return password;
    }
}