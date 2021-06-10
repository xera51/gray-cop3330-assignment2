/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenHeartRateCalculatorTest {

    @Test
    void heart_rate_returns_proper_result() {
        KarvonenHeartRateCalculator calculator = new KarvonenHeartRateCalculator();

        assertEquals(138, calculator.calculateTargetHeartRate(22, 65, 0.55));
    }

    @Test
    void heart_rate_returns_proper_result_2() {
        KarvonenHeartRateCalculator calculator = new KarvonenHeartRateCalculator();

        assertEquals(145, calculator.calculateTargetHeartRate(22, 65, 0.60));
    }

    @Test
    void heart_rate_returns_proper_result_3() {
        KarvonenHeartRateCalculator calculator = new KarvonenHeartRateCalculator();

        assertEquals(151, calculator.calculateTargetHeartRate(22, 65, 0.65));
    }

    @Test
    void heart_rate_returns_proper_result_4() {
        KarvonenHeartRateCalculator calculator = new KarvonenHeartRateCalculator();

        assertEquals(191, calculator.calculateTargetHeartRate(22, 65, 0.95));
    }

    // Cannot get test to work because of inaccuracy of doubles
    @Test
    void heart_rate_array_gives_proper_results() {
        KarvonenHeartRateCalculator calculator = new KarvonenHeartRateCalculator();

        int[] personData = {22, 65};
        double[] rangeData = {0.55, 0.95, 0.05};

        double[][] expected = {{0.55, 138}, {0.60, 145}, {0.65, 151}, {0.70, 158},
                {0.75, 165}, {0.80, 171}, {0.85, 178}, {0.90, 185}, {0.95, 191}};
        double[][] actual = calculator.calculateTargetHeartRateRange(personData, rangeData);

        assertArrayEquals(expected, actual);
    }
}