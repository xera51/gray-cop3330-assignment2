/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex37.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    @DisplayName("Output is correctly formatted")
    void output_string_is_formatted_correctly() {
        Main app = new Main();
        PasswordGenerator generator = new PasswordGenerator(8, 13, 2, 2);

        String password = generator.generatePassword();

        String expected = String.format("Your password is %s", password);
        String actual = app.buildOutputString(password);

        assertEquals(expected, actual);
    }
}