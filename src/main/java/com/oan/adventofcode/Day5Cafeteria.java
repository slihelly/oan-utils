package com.oan.adventofcode;

import java.math.BigInteger;
import java.util.*;

public class Day5Cafeteria {
    public int getFreshIngredientsAmount(List<String> input) {
        // Parse input into ranges and ingredients
        boolean isFirstPartOfList = true;
        List<Map.Entry<BigInteger, BigInteger>> ranges = new ArrayList<>();
        List<BigInteger> ingredientIds = new ArrayList<>();

        for (String line : input) {
            if (line.isEmpty()) {
                isFirstPartOfList = false;
            } else {
                if (isFirstPartOfList) {
                    BigInteger rangeBeginning = new BigInteger(line.substring(0, line.indexOf('-')));
                    BigInteger rangeEnd = new BigInteger(line.substring(line.indexOf('-') + 1));
                    ranges.add(Map.entry(rangeBeginning, rangeEnd));
                } else {
                    ingredientIds.add(new BigInteger(line));
                }
            }
        }

        // Evaluate which ingredients are fresh
        int freshIngredientsAmount = 0;
        for(BigInteger id : ingredientIds) {
            Optional<Map.Entry<BigInteger, BigInteger>> includingRange = ranges.stream()
                    .filter(range -> range.getKey().compareTo(id) <= 0 && range.getValue().compareTo(id) >= 0)
                    .findFirst();
            if (includingRange.isPresent() ) {
                freshIngredientsAmount++;
            }
        }
        return freshIngredientsAmount;
    }
}
