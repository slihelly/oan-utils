package com.oan.leet;

import java.util.Stack;

public class ValidParenthesisSolution {
    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        for(char curr : s.toCharArray()) {
            if(curr == '(' || curr == '{' || curr == '[') {
                characterStack.push(curr);
            } else if (characterStack.isEmpty()) {
                return false;
            } else {
                char top = characterStack.pop();
                if(!(curr == ')' && top == '(') &&
                        !(curr == '}' && top == '{') &&
                        !(curr == ']' && top == '[')) {
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }
}
