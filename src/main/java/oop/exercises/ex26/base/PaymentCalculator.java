/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex26.base;

import java.math.BigDecimal;
import static java.math.BigDecimal.ONE;
import static java.math.RoundingMode.HALF_EVEN;
import static java.math.RoundingMode.CEILING;
import static oop.exercises.ex26.base.BigDecimalCalculations.log10;

public class PaymentCalculator {

    private static final BigDecimal NEGATIVE_ONE_OVER_THIRTY =
            ONE.divide(BigDecimal.valueOf(30), 30, HALF_EVEN).negate();
    private static final int precision = 30;

    public int calculateMonthsUntilPayedOff(BigDecimal balance, BigDecimal APR, BigDecimal payment) {
        balance = roundUpToNearestCent(balance);
        payment = roundUpToNearestCent(payment);
        APR = APR.divide(BigDecimal.valueOf(100), precision, HALF_EVEN);

        BigDecimal i = APR.divide(BigDecimal.valueOf(365), precision, HALF_EVEN);
        BigDecimal bOverP = balance.divide(payment, precision, HALF_EVEN);

        BigDecimal numerator;
        try {
            numerator = log10(ONE.add(
                    bOverP.multiply(ONE.subtract(ONE.add(i).pow(30)))), precision);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Can never be payed off");
        }
        BigDecimal denominator = log10(ONE.add(i), precision);

        return NEGATIVE_ONE_OVER_THIRTY.multiply(numerator.divide(
                denominator, precision, HALF_EVEN)).setScale(0, CEILING).intValue();
    }

    private BigDecimal roundUpToNearestCent(BigDecimal currency) {
        return currency.setScale(2, CEILING);
    }

}
