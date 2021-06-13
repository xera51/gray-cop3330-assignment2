/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex26.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    @DisplayName("Balance: 5000, APR: 12%, Payment: 100")
    void month_calculator_returns_the_correct_value() {
        PaymentCalculator calculator = new PaymentCalculator();

        assertEquals(70, calculator.calculateMonthsUntilPayedOff(5000, 12, 100));
    }

    @Test
    @DisplayName("Balance: 99999. APR: 99%, Payment: 1")
    void month_calculator_throws_exception_for_infinity() {
        PaymentCalculator calculator = new PaymentCalculator();

        assertThrows(ArithmeticException.class, () -> calculator.calculateMonthsUntilPayedOff(99999, 99, 1));

    }
}