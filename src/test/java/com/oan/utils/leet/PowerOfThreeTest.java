package com.oan.utils.leet;

import static org.assertj.core.api.Assertions.assertThat;

import com.oan.leet.PowerOfThreeSolution;
import org.junit.jupiter.api.Test;

public class PowerOfThreeTest {
    PowerOfThreeSolution solution = new PowerOfThreeSolution();

    @Test
    public void solutionTest1() {
        assertThat(solution.isPowerOfThree(27)).isTrue();
    }

    @Test
    public void solutionTest2() {
        assertThat(solution.isPowerOfThree(0)).isFalse();
    }

    @Test
    public void solutionTest3() {
        assertThat(solution.isPowerOfThree(-1)).isFalse();
    }
}
