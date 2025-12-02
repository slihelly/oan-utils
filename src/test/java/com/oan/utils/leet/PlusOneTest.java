package com.oan.utils.leet;

import static org.assertj.core.api.Assertions.assertThat;

import com.oan.leet.PlusOneSolution;
import org.junit.jupiter.api.Test;

public class PlusOneTest {
    PlusOneSolution solution = new PlusOneSolution();

    @Test
    public void solutionTest1() {
        int[] input = { 1, 2, 3 };
        assertThat(solution.plusOne(input)).containsExactly(1, 2, 4);
    }

    @Test
    public void solutionTest2() {
        int[] input = { 4, 3, 2, 1 };
        assertThat(solution.plusOne(input)).containsExactly(4, 3, 2, 2);
    }

    @Test
    public void solutionTest3() {
        int[] input = { 9 };
        assertThat(solution.plusOne(input)).containsExactly(1, 0);
    }
}
