package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

import java.util.Arrays;
import java.util.Stack;

/**
 * @since 2020-08-15
 */
public class A04_DailyTemperature {

    public static void main(String[] args) {
        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
        // index 의 차이만큼이다.
        int[] res = dailyTemp(nums);

        System.out.println(Arrays.toString(res));

    }

    private static int[] dailyTemp(int[] temper) {
        //stack
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temper.length];

        for (int i = 0; i < temper.length; i++) {
            while (!stack.isEmpty() && temper[stack.peek()] < temper[i]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }

        return result;
    }

}
