package com.oan.utils.leet;

import static org.assertj.core.api.Assertions.assertThat;

import com.oan.leet.DefangingIpAddressSolution;
import org.junit.Test;

public class DefangignIpAddressTest {
    DefangingIpAddressSolution solution = new DefangingIpAddressSolution();

    @Test
    public void solutionTest1() {
        assertThat(solution.defangIPaddr("1.1.1.1")).isEqualTo("1[.]1[.]1[.]1");
    }

    @Test
    public void solutionTest2() {
        assertThat(solution.defangIPaddr("255.100.50.0")).isEqualTo("255[.]100[.]50[.]0");
    }
}
