/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex33.base;

import oop.exercises.utility.DataReader;

import java.util.Random;

public class Magic8Ball {

    private static final String[] RESPONSES = {"Yes.", "No.", "Maybe.", "Ask again later."};
    private static final DataReader in = new DataReader();

    public String shakeBall() {
        in.readString("What is your question?%n ");
        System.out.println();

        return generateResponse();
    }

    // Ideally would be private, but needed something to test
    public String generateResponse() {
        Random generator = new Random();
        return RESPONSES[generator.nextInt(RESPONSES.length)];
    }
}
