/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex32.base;

public class Solution32 {

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();

        System.out.println("Let's play Guess the Number!");

        do {
            System.out.println();
            game.playGuessingGame();
        } while (game.readPlayAgain());
    }
}
