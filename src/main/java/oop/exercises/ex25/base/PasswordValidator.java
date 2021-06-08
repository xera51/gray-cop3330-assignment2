/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex25.base;

public class PasswordValidator {

    // ex25/passwordValidator.puml shows how strength is determined
    public int passwordValidator(String password) {

        if(password.contains(" ")) {
            throw new IllegalArgumentException("Password cannot contain whitespace");
        }

        if(isNumeric(password) && password.length() < 8) {
            return 0;
        } else if (isNumeric(password) || password.length() < 8) {
            return 1;
        } else if (containsDigit(password) && containsSpecial(password) && containsLetter(password)) {
            return 4;
        } else if (containsDigit(password) || (containsLetter(password) && containsSpecial(password))) {
            return 3;
        } else {
            return 2;
        }
    }


    public String passwordCodeToString(int code) {
        String output = switch (code) {
            case 0:
                yield "very weak";
            case 1:
                yield "weak";
            case 2:
                yield "good";
            case 3:
                yield "strong";
            case 4:
                yield "very strong";
            default:
                throw new IllegalArgumentException("Invalid password strength code");
        };
        return output;
    }

    private boolean isNumeric(String input) {
        return input.matches("\\d+");
    }

    private boolean containsDigit(String input) {
        char[] arr = input.toCharArray();

        for(char c : arr) {
            if (Character.isDigit(c)) { return true; }
        }
        return false;
    }

    private boolean containsLetter(String input) {
        char[] arr = input.toCharArray();

        for(char c : arr) {
            if (Character.isLetter(c)) { return true; }
        }
        return false;
    }

    private boolean containsSpecial(String input) {
        char[] arr = input.toCharArray();

        for(char c : arr) {
            if (!Character.isLetterOrDigit(c)) { return true; }
        }
        return false;
    }
}
