package com.oan.leet;

public class PlusOneSolution {
    public int[] plusOne(int[] digits) {
        boolean isLeadingNumberRequired = false;
        boolean plusOneInNextDigit = digits[digits.length - 1] == 9;
        int currIndex = digits.length - 1;
        if (!plusOneInNextDigit) {
            digits[digits.length - 1] += 1;
            return digits;
        }
        while (plusOneInNextDigit && !isLeadingNumberRequired) {
            digits[currIndex] = 0;
            if (currIndex == 0) {
                isLeadingNumberRequired = true;
            } else {
                digits[currIndex - 1] += 1;
                if (digits[currIndex - 1] == 10) {
                    digits[currIndex - 1] = 0;
                } else {
                    plusOneInNextDigit = false;
                }
            }
            currIndex--;
        }
        if (isLeadingNumberRequired) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                arr[i + 1] = digits[i];
            }
            return arr;
        }
        return digits;
    }
}
