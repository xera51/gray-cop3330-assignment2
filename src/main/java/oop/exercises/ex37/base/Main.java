/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex37.base;

import oop.exercises.utility.DataReader;

public class Main {

    private final DataReader in = new DataReader();
    private PasswordGenerator passwordGenerator;

    public static void main(String[] args) {
        Main app = new Main();

        int minLength = app.in.readIntValidated("What is the minimum length? ",
                "Please enter an integer number.");
        int numSpecial = app.in.readIntValidated("How many special characters? ",
                "Please enter an integer number.");
        int numNumbers = app.in.readIntValidated("How many numbers? ",
                "Please enter an integer number.");

        app.passwordGenerator = new PasswordGenerator(minLength, minLength + 5,
                numNumbers, numSpecial);

        String password = app.passwordGenerator.generatePassword();
        String output = app.buildOutputString(password);
        System.out.println(password);
    }

    public String buildOutputString(String password) {
        return String.format("Your password is %s", password);
    }
}
