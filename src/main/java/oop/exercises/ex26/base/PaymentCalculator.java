/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex26.base;

public class PaymentCalculator {

    public int calculateMonthsUntilPayedOff(double balance, double APR, double payment) {
        balance = roundUpToNearestCent(balance);
        payment = roundUpToNearestCent(payment);
        APR = APR / 100;

        double i = APR / 365;
        double bOverP = balance / payment;

        double inLog = 1 + (bOverP * (1 - Math.pow(1 + i, 30)));
        if(inLog < 0) {
            throw new ArithmeticException("The card can never be payed off");
        }

        double numerator = Math.log(inLog);
        double denominator = Math.log(1 + i);

        return (int) Math.ceil((-1 / 30.0) * (numerator / denominator));
    }

    private double roundUpToNearestCent(double currency) {
        return (Math.ceil(currency * 100)) / 100.0;
    }

}
