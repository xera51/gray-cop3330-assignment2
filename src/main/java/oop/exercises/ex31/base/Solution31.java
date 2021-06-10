/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex31.base;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution31 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        KarvonenHeartRateCalculator calc = new KarvonenHeartRateCalculator();

        int age = readIntValidated("Age: ");
        int restingHeartRate = readIntValidated("Resting Heart Rate: ");

        int[] personData = {age, restingHeartRate};
        double[] rangeData = {0.55, 0.95, 0.05};

        calc.displayHeartRateTable(personData, rangeData);
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
