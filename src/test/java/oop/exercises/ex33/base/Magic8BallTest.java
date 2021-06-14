/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex33.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {

    // Ideally would be set up to run many times

    @Test
    @DisplayName("8 Ball returns an appropriate String")
    void eight_ball_returns_an_appropriate_string() {
        Magic8Ball ball = new Magic8Ball();

        String response = ball.generateResponse();

        assertTrue(response.equals("Yes.") || response.equals("No.") ||
                response.equals("Maybe.") || response.equals("Ask again later."));
    }
}