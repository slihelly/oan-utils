package com.oan.leet;

public class Maximum69NumberSolution {
    public int maximum69Number (int num) {
        String number = Integer.toString(num);
        return Integer.parseInt(number.replaceFirst("6","9"));
    }
}
