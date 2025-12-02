package com.oan.utils.leet;

import static org.assertj.core.api.Assertions.assertThat;

import com.oan.leet.ValidParenthesisSolution;
import org.junit.jupiter.api.Test;

public class ValidParenthesisTest {

    @Test
    public void solutionTest() {
        String test = "()[]{}";
        assertThat(ValidParenthesisSolution.isValid(test)).isTrue();
    }

    @Test
    public void solutionTest2() {
        String test = "(]";
        assertThat(ValidParenthesisSolution.isValid(test)).isFalse();
    }

    @Test
    public void solutionTest3() {
        String test = "()";
        assertThat(ValidParenthesisSolution.isValid(test)).isTrue();
    }
}
