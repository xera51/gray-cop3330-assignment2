/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex28.base;

import oop.exercises.utility.DataReader;

public class Main {

    private final DataReader in = new DataReader();

    public static void main(String[] args) {
        Main app = new Main();

        double[] numbers = app.in.readNDoublesValidated("Enter a number: ", 5);
        double total = app.calculateTotal(numbers);
        System.out.println("The total is " + total + ".");
    }

    public double calculateTotal(double[] numbers) {
        double total = 0;
        for(double number : numbers) {
            total += number;
        }
        return total;
    }
}
