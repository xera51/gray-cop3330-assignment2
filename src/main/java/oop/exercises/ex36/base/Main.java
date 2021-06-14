/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex36.base;

public class Main {

    private final ResponseTimes responseTimes = new ResponseTimes();

    public static void main(String[] args) {
        Main app = new Main();

        app.responseTimes.readResponseTimes();
        app.responseTimes.displayStatistics();
    }
}
