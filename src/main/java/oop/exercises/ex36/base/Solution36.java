/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex36.base;

public class Solution36 {

    public static void main(String[] args) {
        ResponseTimes responseTimes = new ResponseTimes();

        responseTimes.readResponseTimes();
        responseTimes.displayStatistics();
    }
}
