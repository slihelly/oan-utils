package com.oan.leet;

public class ReverseStringSolution {

    /**
     * Write a function that reverses a string.
     * The input string is given as an array of characters s.
     * You must do this by modifying the input array in-place with O(1) extra memory.
     * @param s input string
     */
    public void reverseString(char[] s) {
        int pointer1 = 0;
        int pointer2 = s.length - 1;
        char swap;
        while(pointer1 < pointer2) {
            swap = s[pointer1];
            s[pointer1] = s[pointer2];
            s[pointer2] = swap;

            pointer1++;
            pointer2--;
        }
    }
}
