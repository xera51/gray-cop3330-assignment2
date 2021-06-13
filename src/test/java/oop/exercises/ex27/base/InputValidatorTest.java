/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex27.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class InputValidatorTest {

    @Test
    @DisplayName("First: J Last: Zip: ABCDE ID: A12-1234")
    void validator_should_find_errors() {
        InputValidator validator = new InputValidator();

        String expected = String.format("\"J\" is not a valid first name. It is too short.%n" +
                "The last name must be filled in.%n" +
                "The ZIP code must be numeric.%n" +
                "A12-1234 is not a valid ID.");
        String actual = validator.validateInput("J", "", "ABCDE", "A12-1234");

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("First: Jimmy Last: James Zip: 55555 ID: TK-4213")
    void validator_should_find_no_errors() {
        InputValidator validator = new InputValidator();

        String expected = "There were no errors found.";
        String actual = validator.validateInput("Jimmy", "James", "55555", "TK-4213");

        assertEquals(expected, actual);
    }
}