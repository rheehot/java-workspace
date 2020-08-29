package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

/**
 * @author Andrew
 * @since 2020-08-18
 */
public class A13_MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    private static int maxSubArray(int[] nums) {
        int newSum = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            newSum = Math.max(nums[i], nums[i] + newSum);
            max = Math.max(newSum, max);
        }

        return max;
    }

}
