package com.oan.adventofcode;

import java.math.BigInteger;

public class Day6TrashCompactor {
    public String getGrandTotal(String[] input) {
        BigInteger grandTotal = BigInteger.ZERO;
        int inputStringLength = input[0].length();

        StringBuilder[] tokens = new StringBuilder[input.length];
        for (int j = 0; j < input.length; j++) {
            tokens[j] = new StringBuilder();
        }
        for (int i = 0; i < inputStringLength; i++) {
            StringBuilder tokensAtI = new StringBuilder();
            for (int j = 0; j < input.length; j++) {
                tokens[j].append(input[j].charAt(i));
                tokensAtI.append(input[j].charAt(i));
            }
            if (tokensAtI.toString().trim().isEmpty() || i == inputStringLength - 1) {
                BigInteger subTotal;
                String operand = tokens[tokens.length - 1].toString().trim();
                tokens[tokens.length - 1] = new StringBuilder();
                if ("*".equals(operand)) {
                    subTotal = BigInteger.ONE;
                    for (int j = 0; j < tokens.length - 1; j++) {
                        subTotal = subTotal.multiply(new BigInteger(tokens[j].toString().trim()));
                        tokens[j] = new StringBuilder();
                    }
                } else if ("+".equals(operand)) {
                    subTotal = BigInteger.ZERO;
                    for (int j = 0; j < tokens.length - 1; j++) {
                        subTotal = subTotal.add(new BigInteger(tokens[j].toString().trim()));
                        tokens[j] = new StringBuilder();
                    }
                } else {
                    throw new RuntimeException("Unsupported operand");
                }
                grandTotal = grandTotal.add(subTotal);
            }
        }

        return grandTotal.toString();
    }
}
