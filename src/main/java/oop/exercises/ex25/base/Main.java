/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex25.base;

import oop.exercises.utility.DataReader;

public class Main {

    private final DataReader in = new DataReader();
    private final PasswordValidator validator = new PasswordValidator();

    public static void main(String[] args) {
        Main app = new Main();

        String password = app.in.readString("Enter a password: ");

        app.validatePassword(password);
    }

    private void validatePassword(String password) {
        try {
            int strengthCode = validator.passwordValidator(password);
            String strength = validator.passwordCodeToString(strengthCode);
            String output = buildOutputString(password, strength);
            System.out.print(output);
        } catch (IllegalArgumentException e) {
            System.out.printf("Invalid password: %s%n", e.getMessage());
        }
    }

    private String buildOutputString(String password, String strength) {
        return String.format("The password '%s' is a %s password.",
                password, strength);
    }
}
