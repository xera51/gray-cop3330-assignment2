/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex27.base;

import oop.exercises.utility.DataReader;

public class Main {

    private final DataReader in = new DataReader();
    private final InputValidator validator = new InputValidator();

    public static void main(String[] args) {
        Main app = new Main();

        String first = app.in.readString("Enter the first name: ");
        String last = app.in.readString("Enter the last name: ");
        String zip = app.in.readString("Enter the ZIP code: ");
        String id = app.in.readString("Enter an employee ID: ");

        System.out.println(app.validator.validateInput(first, last, zip, id));
    }
}
