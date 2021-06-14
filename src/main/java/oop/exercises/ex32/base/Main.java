/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex32.base;

public class Main {

    private final GuessingGame game = new GuessingGame();

    public static void main(String[] args) {
        Main app = new Main();

        System.out.println("Let's play Guess the Number!");

        do {
            System.out.println();
            app.game.playGuessingGame();
        } while (app.game.readPlayAgain());
    }
}
