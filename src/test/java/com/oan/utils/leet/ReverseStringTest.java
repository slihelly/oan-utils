package com.oan.utils.leet;

import static org.assertj.core.api.Assertions.assertThat;

import com.oan.leet.ReverseStringSolution;
import org.junit.Test;

public class ReverseStringTest {
    ReverseStringSolution solution = new ReverseStringSolution();

    @Test
    public void solutionTest1() {
        char[] arr = new char[] { 'h', 'e', 'l', 'l', 'o' };
        solution.reverseString(arr);
        assertThat(arr).containsExactly('o', 'l', 'l', 'e', 'h');
    }

    @Test
    public void solutionTest2() {
        char[] arr = new char[] { 'H', 'a', 'n', 'n', 'a', 'h' };
        solution.reverseString(arr);
        assertThat(arr).containsExactly('h', 'a', 'n', 'n', 'a', 'H');
    }
}
