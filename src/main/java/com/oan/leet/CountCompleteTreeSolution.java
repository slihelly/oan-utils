package com.oan.leet;

public class CountCompleteTreeSolution {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
