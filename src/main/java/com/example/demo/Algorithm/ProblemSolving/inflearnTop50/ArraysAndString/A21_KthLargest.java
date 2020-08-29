package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Geonguk Han
 * @since 2020-08-26
 */
public class A21_KthLargest {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("1번째 답: " + solve(nums, k));
        System.out.println("2번째 답: " + solve2(nums, k));

    }

    private static int solve(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.peek();
    }

    private static int solve2(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
