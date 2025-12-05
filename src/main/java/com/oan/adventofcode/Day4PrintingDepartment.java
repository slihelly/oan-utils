package com.oan.adventofcode;

public class Day4PrintingDepartment {
    public int getAccessibleRollsAmount(String[] input) {
        int accessibleRollsAmount = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length(); j++) {
                int adjacentCount = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    if (k >= 0 && k <= input.length - 1) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (l >= 0 && l <= input[0].length() - 1 && !(k == i && l == j)) {
                                adjacentCount += (input[k].charAt(l) == '@' ? 1 : 0);
                            }
                        }
                    }
                }
                if (adjacentCount < 4 && input[i].charAt(j) == '@') {
                    accessibleRollsAmount++;
                }
            }
        }
        return accessibleRollsAmount;
    }
}
