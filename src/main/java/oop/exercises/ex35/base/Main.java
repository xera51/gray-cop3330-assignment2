/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex35.base;

public class Main {

    private final PickAWinner pickAWinner = new PickAWinner();

    public static void main(String[] args) {
        Main app = new Main();

        app.pickAWinner.readEntries();
        String winner = app.pickAWinner.pickAWinner();
        System.out.println(winner);
    }
}
