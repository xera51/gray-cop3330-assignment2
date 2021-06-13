/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex26.base;

import oop.exercises.utility.DataReader;

public class Main {

    private final DataReader in = new DataReader();
    private final PaymentCalculator paymentCalc = new PaymentCalculator();

    public static void main(String[] args) {
        Main app = new Main();

        double balance = app.in.readDouble("What is your balance? ");
        double APR = app.in.readDouble("What is the APR on the card (as a percent)? ");
        double payment = app.in.readDouble("What is the monthly payment you can make? ");

        app.monthsUntilPayedOff(balance, APR, payment);
    }

    private void monthsUntilPayedOff(double balance, double APR, double payment) {
        try {
            int numMonthsUntilPayed = paymentCalc.
                    calculateMonthsUntilPayedOff(balance, APR, payment);
            System.out.printf("It will take you %d months to pay off this card.%n",
                    numMonthsUntilPayed);
        } catch (ArithmeticException e) {
            System.out.println("The card will never be payed off");
        }
    }
}

