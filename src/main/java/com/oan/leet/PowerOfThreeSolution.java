package com.oan.leet;

public class PowerOfThreeSolution {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        if (n % 3 == 0) {
            return isPowerOfThree(n / 3);
        } else {
            return n == 1;
        }
    }
}
