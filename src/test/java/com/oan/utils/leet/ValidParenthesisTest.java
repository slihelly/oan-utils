package com.oan.utils.leet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.oan.leet.ValidParenthesisSolution;
import org.junit.Test;

public class ValidParenthesisTest {

    @Test
    public void solutionTest() {
        String test = "()[]{}";
        assertTrue(ValidParenthesisSolution.isValid(test));
    }

    @Test
    public void solutionTest2() {
        String test = "(]";
        assertFalse(ValidParenthesisSolution.isValid(test));
    }

    @Test
    public void solutionTest3() {
        String test = "()";
        assertTrue(ValidParenthesisSolution.isValid(test));
    }
}
