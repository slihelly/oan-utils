package com.oan.leet;

public class LongestCommonPrefixSolution {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder longestPrefix = new StringBuilder();
        int shortestArrIndex = 0;
        int shortestArrLength = strs[0].length();
        for(int i = 0; i < strs.length; i++) {
            if(strs[i].length() <= shortestArrLength) {
                shortestArrIndex = i;
                shortestArrLength = strs[i].length();
            }
        }
        for(int i = 0; i < strs[shortestArrIndex].length(); i++) {
            char curr = strs[shortestArrIndex].charAt(i);
            for(String str: strs) {
                if(str.charAt(i) != curr) {
                    return longestPrefix.toString();
                }
            }
            longestPrefix.append(curr);
        }
        return longestPrefix.toString();
    }
}
