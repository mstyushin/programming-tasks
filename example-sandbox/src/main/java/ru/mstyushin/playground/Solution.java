package ru.mstyushin.playground;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices = new int[] { i,j };
                    return indices;
                }
            } 
        }
        return indices;
    }

}
