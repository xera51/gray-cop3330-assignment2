// NOT CREATED BY ME
package oop.exercises.ex26.base;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalCalculations {

    //http://everything2.com/index.pl?node_id=946812
    public static BigDecimal log10(BigDecimal b, int dp)
    {
        final int NUM_OF_DIGITS = dp+2; // need to add one to get the right number of dp
        //  and then add one again to get the next number
        //  so I can round it correctly.

        MathContext mc = new MathContext(NUM_OF_DIGITS, RoundingMode.HALF_EVEN);

        //special conditions:
        // log(-x) -> exception
        // log(1) == 0 exactly;
        // log of a number lessthan one = -log(1/x)
        if(b.signum() <= 0)
            throw new ArithmeticException("log of a negative number! (or zero)");
        else if(b.compareTo(BigDecimal.ONE) == 0)
            return BigDecimal.ZERO;
        else if(b.compareTo(BigDecimal.ONE) < 0)
            return (log10((BigDecimal.ONE).divide(b,mc),dp)).negate();

        StringBuffer sb = new StringBuffer();
        //number of digits on the left of the decimal point
        int leftDigits = b.precision() - b.scale();

        //so, the first digits of the log10 are:
        sb.append(leftDigits - 1).append(".");

        //this is the algorithm outlined in the webpage
        int n = 0;
        while(n < NUM_OF_DIGITS)
        {
            b = (b.movePointLeft(leftDigits - 1)).pow(10, mc);
            leftDigits = b.precision() - b.scale();
            sb.append(leftDigits - 1);
            n++;
        }

        BigDecimal ans = new BigDecimal(sb.toString());

        //Round the number to the correct number of decimal places.
        ans = ans.round(new MathContext(ans.precision() - ans.scale() + dp, RoundingMode.HALF_EVEN));
        return ans;
    }
}
