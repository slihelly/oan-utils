package com.oan.utils.leet;

import static org.assertj.core.api.Assertions.assertThat;

import com.oan.leet.LastWordLengthSolution;
import org.junit.jupiter.api.Test;

public class LastWordLengthTest {
    @Test
    public void solutionTest1() {
        String s = "Hello World";
        assertThat(LastWordLengthSolution.lengthOfLastWord(s)).isEqualTo(5);
    }

    @Test
    public void solutionTest2() {
        String s = "   fly me   to   the moon  ";
        assertThat(LastWordLengthSolution.lengthOfLastWord(s)).isEqualTo(4);
    }

    @Test
    public void solutionTest3() {
        String s = "luffy is still joyboy";
        assertThat(LastWordLengthSolution.lengthOfLastWord(s)).isEqualTo(6);
    }
}
