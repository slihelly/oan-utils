package com.oan.utils.leet;

import static com.oan.leet.LongestCommonPrefixSolution.longestCommonPrefix;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {
    @Test
    public void solutionTest1() {
        String[] input = {"flower","flow","flight"};
        assertThat(longestCommonPrefix(input)).isEqualTo("fl");
    }

    @Test
    public void solutionTest2() {
        String[] input = {"dog","racecar","car"};
        assertThat(longestCommonPrefix(input)).isEqualTo("");
    }

    @Test
    public void solutionTest3() {
        String[] input = {"ab", "a"};
        assertThat(longestCommonPrefix(input)).isEqualTo("a");
    }
}
