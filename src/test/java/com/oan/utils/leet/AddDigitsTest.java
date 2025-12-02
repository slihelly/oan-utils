package com.oan.utils.leet;

import static org.assertj.core.api.Assertions.assertThat;

import com.oan.leet.AddDigitsSolution;
import org.junit.jupiter.api.Test;

public class AddDigitsTest {
    AddDigitsSolution solution = new AddDigitsSolution();

    @Test
    public void solutionTest1() {
        assertThat(solution.addDigits(38)).isEqualTo(2);
    }

    @Test
    public void solutionTest2() {
        assertThat(solution.addDigits(0)).isEqualTo(0);
    }

    @Test
    public void solutionTest3() {
        assertThat(solution.addDigits(2147483647)).isEqualTo(1);
    }
}
