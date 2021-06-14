/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex35.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PickAWinnerTest {

    @Test
    @DisplayName("Winner is shown properly")
    void winner_string_is_properly_formatted(){
        PickAWinner pickAWinner = new PickAWinner();

        pickAWinner.addEntry("Homer");

        String expected = "The winner is... Homer.";
        String actual = pickAWinner.pickAWinner();

        assertEquals(expected, actual);
    }
}