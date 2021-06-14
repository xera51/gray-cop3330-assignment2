/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex31.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenHeartRateCalculatorTest {

    @Test
    @DisplayName("Age: 22 Resting Heart Rate: 65 Intensity: 55%")
    void heart_rate_returns_proper_result_set1() {
        KarvonenHeartRateCalculator calculator = new KarvonenHeartRateCalculator();

        assertEquals(138, calculator.calculateTargetHeartRate(22, 65, 0.55));
    }

    @Test
    @DisplayName("Age: 22 Resting Heart Rate: 65 Intensity: 65%")
    void heart_rate_returns_proper_result_set2() {
        KarvonenHeartRateCalculator calculator = new KarvonenHeartRateCalculator();

        assertEquals(145, calculator.calculateTargetHeartRate(22, 65, 0.60));
    }

    @Test
    @DisplayName("Age: 22 Resting Heart Rate: 65 Intensity: 65%")
    void heart_rate_returns_proper_result_set3() {
        KarvonenHeartRateCalculator calculator = new KarvonenHeartRateCalculator();

        assertEquals(151, calculator.calculateTargetHeartRate(22, 65, 0.65));
    }

    @Test
    @DisplayName("Age: 22 Resting Heart Rate: 65 Intensity: 95%")
    void heart_rate_returns_proper_result_set4() {
        KarvonenHeartRateCalculator calculator = new KarvonenHeartRateCalculator();

        assertEquals(191, calculator.calculateTargetHeartRate(22, 65, 0.95));
    }

    @Test
    @DisplayName("Table is built correctly")
    void table_is_built_correctly() {
        KarvonenHeartRateCalculator calculator = new KarvonenHeartRateCalculator();

        double[] personData = {22, 65};
        double[] rangeData = {0.55, 0.95, 0.05};

        String expected = String.format("Resting Pulse: 65        Age: 22%n%n" +
                "Intensity    | Rate%n" +
                "-------------|--------%n" +
                "55%%          | 138 bpm%n" +
                "60%%          | 145 bpm%n" +
                "65%%          | 151 bpm%n" +
                "70%%          | 158 bpm%n" +
                "75%%          | 165 bpm%n" +
                "80%%          | 171 bpm%n" +
                "85%%          | 178 bpm%n" +
                "90%%          | 185 bpm%n" +
                "95%%          | 191 bpm%n");

        String actual = calculator.buildHeartRateTable(personData, rangeData);

        assertEquals(expected, actual);
    }
}