/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex27.base;

import java.util.Scanner;

public class Solution27 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        InputValidator validator = new InputValidator();

        String first = readString("Enter the first name: ");
        String last = readString("Enter the last name: ");
        String zip = readString("Enter the ZIP code: ");
        String id = readString("Enter an employee ID: ");

        System.out.println(validator.validateInput(first, last, zip, id));
    }

    private static String readString(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }
}
