package com.tmobile;

import java.util.HashMap;

public class MoneyConversion {
    String result = "";

    public MoneyConversion() {
    }

    // Main Logic
    public String amountToWordConversion(int input) {
        if (input == 0)
            return "";

        if (input < 10) {
            result = oneDigit(input);
        }
        else if (input < 20) {
            result = twoDigit(input);
        }
        else if (input < 100){
            int tensPlace = input / 10; // 25/10 => 2
            int onePlace = input % 10; // 25 % 10 => 5

            if (tensPlace != 0 && onePlace != 0)
                result = tenDigit(tensPlace) + " " + oneDigit(onePlace);
            else if (tensPlace != 0 && onePlace == 0)
                result = tenDigit(tensPlace);
        }

        result += " dollars only";

        return result;
    }

    // Tens - words conversion
    // 2 - Twenty ...
    private String tenDigit(int num) {
        HashMap<Integer, String> tensDigitMap = new HashMap<Integer, String>();

        tensDigitMap.put(2, "twenty");
        tensDigitMap.put(3, "thirty");
        tensDigitMap.put(4, "forty");
        tensDigitMap.put(5, "fifty");
        tensDigitMap.put(6, "sixty");
        tensDigitMap.put(7, "seventy");
        tensDigitMap.put(8, "eighty");
        tensDigitMap.put(9, "ninety");

        return tensDigitMap.get(num);
    }

    // Two Digit word conversion
    private String twoDigit(int num) {
        HashMap<Integer, String> twoDigitMap = new HashMap<Integer, String>();

        twoDigitMap.put(10, "ten");
        twoDigitMap.put(11, "eleven");
        twoDigitMap.put(12, "twelve");
        twoDigitMap.put(13, "thirteen");
        twoDigitMap.put(14, "fourteen");
        twoDigitMap.put(15, "fifteen");
        twoDigitMap.put(16, "sixteen");
        twoDigitMap.put(17, "seventeen");
        twoDigitMap.put(18, "eighteen");
        twoDigitMap.put(19, "nineteen");

        return twoDigitMap.get(num);
    }

    // Handling one digit number
    private String oneDigit(int num) {
        HashMap<Integer, String> oneDigitMap = new HashMap<Integer, String>();

        oneDigitMap.put(1, "one");
        oneDigitMap.put(2, "two");
        oneDigitMap.put(3, "three");
        oneDigitMap.put(4, "four");
        oneDigitMap.put(5, "five");
        oneDigitMap.put(6, "six");
        oneDigitMap.put(7, "seven");
        oneDigitMap.put(8, "eight");
        oneDigitMap.put(9, "nine");

        return oneDigitMap.get(num);
    }
}
