package com.tmobile;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestMoneyConversion {

    @Test
    public void testOneDigitAmountToWordConversion() {
        MoneyConversion objMoneyConversion = new MoneyConversion();
        String result = objMoneyConversion.amountToWordConversion(6);

        assertEquals("six dollars only", result);
    }

    @Test
    public void testZeroAmountToWordConversion() {
        MoneyConversion objMoneyConversion = new MoneyConversion();
        String result = objMoneyConversion.amountToWordConversion(0);

        assertEquals("", result);
    }

    @Test
    public void testTwoDigitAmountToWordConversion() {
        MoneyConversion objMoneyConversion = new MoneyConversion();
        String result = objMoneyConversion.amountToWordConversion(15);

        assertEquals("fifteen dollars only", result);
    }

    @Test
    public void testTwoDigitTensAmountToWordConversion() {
        MoneyConversion objMoneyConversion = new MoneyConversion();
        String result = objMoneyConversion.amountToWordConversion(30);

        assertEquals("thirty dollars only", result);
    }

    @Test
    public void testNumGreaterTwentyAmountToWordConversion() {
        MoneyConversion objMoneyConversion = new MoneyConversion();
        String result = objMoneyConversion.amountToWordConversion(69);

        assertEquals("sixty nine dollars only", result);
    }
}