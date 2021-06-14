/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex38.base;

import org.junit.jupiter.api.Test;

import static oop.exercises.ex38.base.Main.filterEvenNumbers;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void odd_numbers_are_filtered_out() {

        int[] expected = {0, 2, 4, 6};
        int[] actual = filterEvenNumbers(new int[]{0, 1, 2, 3, 4, 7, 9, 6});
        assertArrayEquals(expected, actual);
    }

}