package com.oan.utils.leet;

import java.util.Arrays;

import com.oan.leet.RemoveDuplicatesSortedArrSolution;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class RemoveDuplicatesSortedArrTest {
    RemoveDuplicatesSortedArrSolution solution = new RemoveDuplicatesSortedArrSolution();

    @Test
    public void solutionTest1() {
        int[] nums = { 1, 1, 2 }; // Input array
        int[] expectedNums = { 1, 2 }; // The expected answer with correct length

        int k = solution.removeDuplicates(nums); // Calls your implementation

        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(k).isEqualTo(expectedNums.length);
        for (int i = 0; i < k; i++) {
            softly.assertThat(nums[i]).isEqualTo(expectedNums[i]);
        }
        System.out.println(Arrays.toString(nums));
        softly.assertAll();
    }

    @Test
    public void solutionTest2() {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }; // Input array
        int[] expectedNums = { 0, 1, 2, 3, 4 }; // The expected answer with correct length

        int k = solution.removeDuplicates(nums); // Calls your implementation

        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(k).isEqualTo(expectedNums.length);
        for (int i = 0; i < k; i++) {
            softly.assertThat(nums[i]).isEqualTo(expectedNums[i]);
        }
        System.out.println(Arrays.toString(nums));
        softly.assertAll();
    }
}
