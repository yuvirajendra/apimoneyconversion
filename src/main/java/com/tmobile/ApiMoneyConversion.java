package com.tmobile;

public class ApiMoneyConversion {
    public static void main(String[] arg) {
        int input = 6;
        String result;

        MoneyConversion objMoneyConversion = new MoneyConversion();

        result = objMoneyConversion.amountToWordConversion(input);
        System.out.println("Result: " + result);
    }
}
