/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex31.base;

import oop.exercises.utility.DataReader;

public class Main {

    private final DataReader in = new DataReader();
    private final KarvonenHeartRateCalculator calculator = new KarvonenHeartRateCalculator();

    public static void main(String[] args) {
        Main app = new Main();

        double age = app.in.readDoubleValidated("Age: ");
        double restingHeartRate = app.in.readDoubleValidated("Resting Heart Rate: ");

        double[] personData = {age, restingHeartRate};
        double[] rangeData = {0.55, 0.95, 0.05};

        String output = app.calculator.buildHeartRateTable(personData, rangeData);
        System.out.println(output);
    }
}
