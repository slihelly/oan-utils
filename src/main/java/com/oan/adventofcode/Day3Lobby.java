package com.oan.adventofcode;

public class Day3Lobby {
    public int getTotalOutputJoltage(String[] inputBanks) {
        int totalOutputJoltage = 0;
        for(String bank : inputBanks) {
            System.out.printf("Bank: %s%n", bank);
            int joltage = getMaximumJoltage(bank);
            System.out.printf("Joltage: %d%n", joltage);
            totalOutputJoltage = totalOutputJoltage + joltage;
        }
        return totalOutputJoltage;
    }

    private int getMaximumJoltage(String bank) {
        int[] batteriesJoltage = bank.chars().map(x -> x - '0').toArray();
        int digit1 = batteriesJoltage[0];
        int digit2 = batteriesJoltage[1];
        for(int i = 1; i < batteriesJoltage.length - 1; i++) {
            if(batteriesJoltage[i] > digit1) {
                digit1 = batteriesJoltage[i];
                digit2 = 0;
            } else if(batteriesJoltage[i] > digit2) {
                digit2 = batteriesJoltage[i];
            }
        }
        if(batteriesJoltage[batteriesJoltage.length - 1] > digit2) {
            digit2 = batteriesJoltage[batteriesJoltage.length - 1];
        }
        return digit1 * 10 + digit2;
    }
}
