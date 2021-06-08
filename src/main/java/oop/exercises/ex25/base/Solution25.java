/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex25.base;

import java.util.Scanner;

public class Solution25 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();

        String password = readPassword();

        try {
            int passwordCode = validator.passwordValidator(password);
            System.out.printf("The password '%s' is a %s password.",
                    password, validator.passwordCodeToString(passwordCode));
        } catch (IllegalArgumentException e) {
            System.out.printf("Invalid password: %s%n", e.getMessage());
        }
    }

    private static String readPassword() {
        System.out.print("Enter a password: ");
        return in.nextLine();
    }
}
