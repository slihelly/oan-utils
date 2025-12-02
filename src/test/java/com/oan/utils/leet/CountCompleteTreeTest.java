package com.oan.utils.leet;

import static org.assertj.core.api.Assertions.assertThat;

import com.oan.leet.CountCompleteTreeSolution;
import org.junit.jupiter.api.Test;

public class CountCompleteTreeTest {
    CountCompleteTreeSolution solution = new CountCompleteTreeSolution();

    @Test
    public void solutionTest1() {
        assertThat(solution.countNodes(null)).isEqualTo(0);
    }

    @Test
    public void solutionTest2() {
        assertThat(solution.countNodes(new CountCompleteTreeSolution.TreeNode(1))).isEqualTo(1);
    }

    @Test
    public void solutionTest3() {
        CountCompleteTreeSolution.TreeNode leaf1 = new CountCompleteTreeSolution.TreeNode(4);
        CountCompleteTreeSolution.TreeNode leaf2 = new CountCompleteTreeSolution.TreeNode(5);
        CountCompleteTreeSolution.TreeNode leaf3 = new CountCompleteTreeSolution.TreeNode(6);
        CountCompleteTreeSolution.TreeNode lvl1 =
                new CountCompleteTreeSolution.TreeNode(2, leaf1, leaf2);
        CountCompleteTreeSolution.TreeNode lvl2 =
                new CountCompleteTreeSolution.TreeNode(3, leaf3, null);
        CountCompleteTreeSolution.TreeNode root =
                new CountCompleteTreeSolution.TreeNode(1, lvl1, lvl2);
        assertThat(solution.countNodes(root)).isEqualTo(6);
    }
}
