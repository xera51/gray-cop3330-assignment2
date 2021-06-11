package oop.exercises.ex26.base;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void month_calculator_returns_the_correct_value() {
        PaymentCalculator calculator = new PaymentCalculator();

        assertEquals(70, calculator.calculateMonthsUntilPayedOff(5000, 12, 100));
    }

    @Test
    void month_calculator_throws_exception_for_infinity() {
        PaymentCalculator calculator = new PaymentCalculator();

        assertThrows(ArithmeticException.class, () -> calculator.calculateMonthsUntilPayedOff(99999, 99, 1));

    }
}