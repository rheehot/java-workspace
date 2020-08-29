package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

import java.util.Arrays;

/**
 * @since 2020-08-16
 */
public class A10_PlusOne {

    public static void main(String[] args) {
//        int[] digits = {1, 2, 3};
        int[] digits = {9, 9, 9};

        System.out.println(Arrays.toString(solve(digits)));

    }

    private static int[] solve(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;

            } else {
                digits[i] = 0;
            }
        }

        if (digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

        return digits;

    }
}
