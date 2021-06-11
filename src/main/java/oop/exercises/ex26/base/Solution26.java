/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex26.base;

import java.util.Scanner;

public class Solution26 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        PaymentCalculator calculator = new PaymentCalculator();

        double balance =
                readDouble("What is your balance? ");
        double APR =
                readDouble("What is the APR on the card (as a percent)? ");
        double monthlyPayment =
                readDouble("What is the monthly payment you can make? ");
        try {
            int numMonthsUntilPayed = calculator.calculateMonthsUntilPayedOff(balance, APR, monthlyPayment);
            System.out.printf("It will take you %d months to pay off this card.%n", numMonthsUntilPayed);
        } catch (ArithmeticException e) {
            System.out.println("It will take you infinite months to pay off this card.");
        }
    }


    private static double readDouble(String prompt) {
        System.out.print(prompt);
        return in.nextDouble();
    }
}

