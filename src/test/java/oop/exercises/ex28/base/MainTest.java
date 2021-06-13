/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex28.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("1 + 2 + 3 + 4 + 5")
    void total_is_properly_calculated_set1() {
        Main app = new Main();
        double[] numbers = {1, 2, 3, 4, 5};

        assertEquals(15, app.calculateTotal(numbers));
    }

    @Test
    @DisplayName("0 + (-1) + (-2) + 7 + 5")
    void total_is_properly_calculated_set2() {
        Main app = new Main();
        double[] numbers = {0, -1, -2, 7, 5};

        assertEquals(9, app.calculateTotal(numbers));
    }

    @Test
    @DisplayName("1 + 3.2 + 5.4 + (-7.67) + 11")
    void total_is_properly_calculated_set3() {
        Main app = new Main();
        double[] numbers = {1, 3.2, 5.4, -7.67, 11};

        assertEquals(12.93, app.calculateTotal(numbers), 0.0001);
    }
}