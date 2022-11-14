package com.oan.leet;

public class RemoveDuplicatesSortedArrSolution {
    public int removeDuplicates(int[] nums) {
        int positionToInsert = 0;
        int nextUniqueNumberPosition = 1;
        while (nextUniqueNumberPosition != nums.length) {
            if (nums[nextUniqueNumberPosition] == nums[positionToInsert]) {
                nextUniqueNumberPosition++;
            } else {
                positionToInsert++;
                nums[positionToInsert] = nums[nextUniqueNumberPosition];
                nextUniqueNumberPosition++;
            }
        }
        return positionToInsert + 1;
    }
}
