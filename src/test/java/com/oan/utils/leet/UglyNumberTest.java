package com.oan.utils.leet;

import static org.assertj.core.api.Assertions.assertThat;

import com.oan.leet.UglyNumberSolution;
import org.junit.Test;

public class UglyNumberTest {
    UglyNumberSolution solution = new UglyNumberSolution();

    @Test
    public void solutionTest1() {
        assertThat(solution.isUgly(6)).isTrue();
    }

    @Test
    public void solutionTest2() {
        assertThat(solution.isUgly(1)).isTrue();
    }

    @Test
    public void solutionTest3() {
        assertThat(solution.isUgly(14)).isFalse();
    }
}
