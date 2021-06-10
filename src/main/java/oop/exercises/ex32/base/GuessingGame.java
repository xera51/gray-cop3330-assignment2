/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex32.base;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    private static final Scanner in = new Scanner(System.in);
    private static final String TOO_LOW = "Too low. Guess again: ";
    private static final String TOO_HIGH = "Too high. Guess again: ";

    public void playGuessingGame() {
        int difficulty = readDifficulty();
        int number = generateNumber(difficulty);
        int guessCount = 0;
        int guess;

        // First guess
        System.out.print("I have my number. What's your guess? ");
        guess = readGuess();
        guessCount++;

        // Repeated guesses
        while(guess != number) {
            if (guess > number) {
                System.out.print(TOO_HIGH);
            } else {
                System.out.print(TOO_LOW);
            }
            guess = readGuess();
            guessCount++;
        }
        System.out.printf("You got it in %d guesses!%n%n", guessCount);
    }

    private int readGuess() {
        int output = -1;

        try {
            output = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException ignored) { }

        return output;
    }

    private int readDifficulty() {
        int output = 0;
        boolean continueLoop = true;

        while(continueLoop) {
            try {
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                output =Integer.parseInt(in.nextLine());
                if(output != 1 && output != 2 && output != 3) {
                    throw new IllegalArgumentException("Not a valid difficulty");
                }
                continueLoop = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter a valid difficulty");
            }
        }
        return output;
    }

    private int generateNumber(int difficulty) {
        Random generator = new Random();
        return 1 + generator.nextInt((int) Math.pow(10, difficulty));
    }

    public boolean readPlayAgain() {
        System.out.print("Do you wish to play again (Y/N)? ");
        return in.nextLine().toLowerCase().startsWith("y");
    }
}
