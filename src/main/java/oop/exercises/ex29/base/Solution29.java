/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex29.base;

import java.util.Scanner;

public class Solution29 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double rate = readNumber();
        double approximateYearsUntilInvestmentDoubles = approximateYearsUntilInvestmentDoubles(rate);

        System.out.printf("It will take %.0f years to double your initial investment.",
                approximateYearsUntilInvestmentDoubles);
    }

    private static double readNumber() {
        double output;

        while(true) {
            System.out.print("What is the rate of return? ");
            try {
                output = Double.parseDouble(in.nextLine());
                if(output == 0) throw new ArithmeticException();
                break;
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        return output;
    }

    private static double approximateYearsUntilInvestmentDoubles(double rate) {
        return Math.ceil(72 / rate - 0.0001);
    }
}
