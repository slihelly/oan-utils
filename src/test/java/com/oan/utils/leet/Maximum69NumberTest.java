package com.oan.utils.leet;

import static org.assertj.core.api.Assertions.assertThat;

import com.oan.leet.Maximum69NumberSolution;
import org.junit.Test;

public class Maximum69NumberTest {
    Maximum69NumberSolution solution = new Maximum69NumberSolution();

    @Test
    public void solutionTest1(){
        assertThat(solution.maximum69Number(9669)).isEqualTo(9969);
    }

    @Test
    public void solutionTest2(){
        assertThat(solution.maximum69Number(9996)).isEqualTo(9999);
    }

    @Test
    public void solutionTest3(){
        assertThat(solution.maximum69Number(9999)).isEqualTo(9999);
    }
}
