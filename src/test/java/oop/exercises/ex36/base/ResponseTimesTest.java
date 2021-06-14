/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex36.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ResponseTimesTest {

    @Test
    @DisplayName("Average")
    void average_is_correctly_calculated() {
        ResponseTimes responseTimes = new ResponseTimes();
        ArrayList<Integer> responseTimeList = new ArrayList<>(Arrays.asList(100, 200, 1000, 300));
        responseTimes.setResponseTimes(responseTimeList);

        String actual = String.format("%.1f", responseTimes.average());

        assertEquals("400.0", actual);
    }

    @Test
    @DisplayName("Min")
    void min_is_correctly_calculated() {
        ResponseTimes responseTimes = new ResponseTimes();
        ArrayList<Integer> responseTimeList = new ArrayList<>(Arrays.asList(100, 200, 1000, 300));
        responseTimes.setResponseTimes(responseTimeList);

        assertEquals(100, responseTimes.min());
    }

    @Test
    @DisplayName("Max")
    void max_is_correctly_calculated() {
        ResponseTimes responseTimes = new ResponseTimes();
        ArrayList<Integer> responseTimeList = new ArrayList<>(Arrays.asList(100, 200, 1000, 300));
        responseTimes.setResponseTimes(responseTimeList);

        assertEquals(1000, responseTimes.max());
    }

    @Test
    @DisplayName("Standard deviation")
    void standard_deviation_is_correctly_calculated() {
        ResponseTimes responseTimes = new ResponseTimes();
        ArrayList<Integer> responseTimeList = new ArrayList<>(Arrays.asList(100, 200, 1000, 300));
        responseTimes.setResponseTimes(responseTimeList);

        String actual = String.format("%.2f", responseTimes.std());

        assertEquals("353.55", actual);
    }
}