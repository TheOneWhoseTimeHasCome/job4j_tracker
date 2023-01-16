package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;
        int countSpecial = 0;
        for (int i = 0; i < password.length(); i++) {
            countUpper = Character.isUpperCase(password.charAt(i)) ? ++countUpper : countUpper;
            countLower = Character.isLowerCase(password.charAt(i)) ? ++countLower : countLower;
            countDigit = Character.isDigit(password.charAt(i)) ? ++countDigit : countDigit;
            countSpecial = !Character.isLetterOrDigit(password.charAt(i)) ? ++countSpecial : countSpecial;
            if (countSpecial > 0 && countDigit > 0 && countLower > 0 && countUpper > 0) {
                break;
            }
            if (i == password.length() - 1 && countUpper == 0) {
                throw new IllegalArgumentException("Password should contain at least one uppercase letter");
            }
            if (i == password.length() - 1 && countLower == 0) {
                throw new IllegalArgumentException("Password should contain at least one lowercase letter");
            }
            if (i == password.length() - 1 && countDigit == 0) {
                throw new IllegalArgumentException("Password should contain at least one figure");
            }
            if (i == password.length() - 1 && countSpecial == 0) {
                throw new IllegalArgumentException("Password should contain at least one special symbol");
            }
        }
        String[] words = {"qwerty", "12345", "password", "admin", "user"};
            for (String word : words) {
                if (password.toLowerCase().contains(word)) {
                    throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
                }
            }
        return password;
    }
}