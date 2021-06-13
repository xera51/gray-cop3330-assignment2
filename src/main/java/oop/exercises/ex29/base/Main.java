/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex29.base;

import oop.exercises.utility.DataReader;

public class Main {

    private final DataReader in = new DataReader();

    public static void main(String[] args) {
        Main app = new Main();

        double rate = app.readRate();
        double approximateYearsUntilInvestmentDoubles = app.approximateYearsUntilInvestmentDoubles(rate);

        String output = app.buildOutputString(approximateYearsUntilInvestmentDoubles);
        System.out.println(output);
    }

    public double approximateYearsUntilInvestmentDoubles(double rate) {
        return Math.ceil(72 / rate - 0.0001);
    }

    public double readRate() {
        boolean continueLoop = true;
        double output = 0;
        String prompt = "What is the rate of return? ";
        String errorMessage = "Sorry. That's not a valid input.";

        while(continueLoop) {
            output = in.readDoubleValidated(prompt, errorMessage);
            if(output != 0) {
                continueLoop = false;
            }
            System.out.println(errorMessage);
        }
        return output;
    }

    public String buildOutputString(double approximateYearsUntilInvestmentDoubles) {
        return String.format("It will take %.0f years to double your initial investment.",
                approximateYearsUntilInvestmentDoubles);
    }
}
