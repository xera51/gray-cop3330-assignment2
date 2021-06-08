package oop.exercises.ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
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
    void validator_should_find_no_errors() {
        InputValidator validator = new InputValidator();

        String expected = "There were no errors found.";
        String actual = validator.validateInput("Jimmy", "James", "55555", "TK-4213");

        assertEquals(expected, actual);
    }
}