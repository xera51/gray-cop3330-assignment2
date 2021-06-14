/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex32.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessingGameTest {

    // Ideally would have it set up to run each test many times

    @Test
    @DisplayName("Valid Number for difficulty one is generated")
    void valid_number_is_generated_set1() {
        GuessingGame game = new GuessingGame();

        int min = 0;
        int max = 10;
        int number = game.generateNumber(1);

        assertTrue(min <= number && number <= max);
    }

    @Test
    @DisplayName("Valid Number for difficulty two is generated")
    void valid_number_is_generated_set2() {
        GuessingGame game = new GuessingGame();

        int min = 0;
        int max = 100;
        int number = game.generateNumber(1);

        assertTrue(min <= number && number <= max);
    }

    @Test
    @DisplayName("Valid Number for difficulty three is generated")
    void valid_number_is_generated_set3() {
        GuessingGame game = new GuessingGame();

        int min = 0;
        int max = 1000;
        int number = game.generateNumber(1);

        assertTrue(min <= number && number <= max);
    }
}