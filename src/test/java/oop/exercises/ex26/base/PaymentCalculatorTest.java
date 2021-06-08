package oop.exercises.ex26.base;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void month_calculator_returns_the_correct_value() {
        PaymentCalculator calculator = new PaymentCalculator();

        assertEquals(70, calculator.calculateMonthsUntilPayedOff(
                BigDecimal.valueOf(5000), BigDecimal.valueOf(12), BigDecimal.valueOf(100)));
    }

    @Test
    void month_calculator_throws_exception_for_infinity() {
        PaymentCalculator calculator = new PaymentCalculator();

        assertThrows(ArithmeticException.class, () -> calculator.calculateMonthsUntilPayedOff(
                BigDecimal.valueOf(99999), BigDecimal.valueOf(99), BigDecimal.valueOf(1)));
    }
}