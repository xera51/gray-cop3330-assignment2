/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex37.base;

import java.util.Scanner;

public class Solution37 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        PasswordGenerator passwordGenerator;

        int minLength = readIntValidated("What is the minimum length? ");
        int numSpecial = readIntValidated("How many special characters? ");
        int numNumbers = readIntValidated("How many numbers? ");

        // max length can be changed
        passwordGenerator = new PasswordGenerator(minLength, minLength + 5,
                numNumbers, numSpecial);

        System.out.printf("Your password is %s%n", passwordGenerator.generatePassword());
    }

    private static int readIntValidated(String prompt) {
        boolean continueLoop = true;
        int value = 0;

        do {
            try {
                System.out.print(prompt);
                value = Integer.parseInt(in.nextLine());
                continueLoop = false;
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer number.");
            }
        } while (continueLoop);

        return value;
    }
}
