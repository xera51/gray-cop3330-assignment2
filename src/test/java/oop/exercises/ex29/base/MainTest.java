/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex29.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Rate: 4")
    void approximation_is_calculated_properly() {
        Main app = new Main();

        double time = app.approximateYearsUntilInvestmentDoubles(4);
        assertEquals(18, time);
    }

    @Test
    @DisplayName("Output String built correctly")
    void output_string_is_built_correctly() {
        Main app = new Main();

        String expected = "It will take 18 years to double your initial investment.";
        String actual = app.buildOutputString(18);

        assertEquals(expected, actual);
    }
}