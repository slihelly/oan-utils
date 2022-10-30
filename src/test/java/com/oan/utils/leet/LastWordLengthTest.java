package com.oan.utils.leet;

import static org.assertj.core.api.Assertions.assertThat;

import com.oan.leet.LastWordLength;
import org.junit.Test;

public class LastWordLengthTest {
    @Test
    public void solutionTest1() {
        String s = "Hello World";
        assertThat(LastWordLength.lengthOfLastWord(s)).isEqualTo(5);
    }

    @Test
    public void solutionTest2() {
        String s = "   fly me   to   the moon  ";
        assertThat(LastWordLength.lengthOfLastWord(s)).isEqualTo(4);
    }

    @Test
    public void solutionTest3() {
        String s = "luffy is still joyboy";
        assertThat(LastWordLength.lengthOfLastWord(s)).isEqualTo(6);
    }
}
