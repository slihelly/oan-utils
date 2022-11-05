package com.oan.leet;

public class LastWordLengthSolution {
    public static int lengthOfLastWord(String s) {
        char[] str = s.toCharArray();
        boolean metNonSpace = false;
        int length = 0;
        for (int i = str.length - 1; i >= 0; i--) {
            if (metNonSpace) {
                if (str[i] == ' ') {
                    return length;
                } else {
                    length++;
                }
            } else if (str[i] != ' ') {
                metNonSpace = true;
                length++;
            }
        }
        return length;
    }
}
