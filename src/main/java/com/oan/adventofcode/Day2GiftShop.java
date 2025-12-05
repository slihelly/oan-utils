package com.oan.adventofcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Day2GiftShop {
    public String getInvalidInputsSum(String[] inputRanges) {
        BigInteger invalidInputsSum = new BigInteger("0");
        for (String range : inputRanges) {
            for(BigInteger invalidInput : getInvalidInputs(range)) {
                invalidInputsSum = invalidInputsSum.add(invalidInput);
            }
        }
        return invalidInputsSum.toString();
    }

    private List<BigInteger> getInvalidInputs(String range) {
        BigInteger firstInRange = new BigInteger(range.split("-")[0]);
        BigInteger lastInRange = new BigInteger(range.split("-")[1]);
        List<BigInteger> invalidInputs = new ArrayList<>();
        System.out.printf("First: %s, Last: %s%n", firstInRange, lastInRange);

        for (BigInteger i = firstInRange; i.compareTo(lastInRange.add(BigInteger.ONE)) <= 0; i = i.add(BigInteger.ONE)) {
            if(isInvalid(i)) {
                System.out.printf("Invalid input: %d%n", i);
                invalidInputs.add(i);
            }
        }

        return invalidInputs;
    }

    private boolean isInvalid(BigInteger index) {
        String str = index.toString();
        int length = str.length();
        if (length % 2 == 1) return false;
        return str.substring(0, length / 2).equals(str.substring(length / 2));
    }

}
