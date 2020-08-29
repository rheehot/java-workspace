package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

import java.util.Arrays;

/**
 * @since 2020-08-12
 */
public class A02_MoveZeros {

    public static void main(String[] args) {

        int[] ints = {0, 3, 2, 0, 8, 5};
        int index = 0;

        // 1
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0) {
                ints[index] = ints[i];
                index++;
            }
        }


        // 2
        while (index < ints.length) {
            ints[index] = 0;
            index++;
        }

        System.out.println(Arrays.toString(ints));

    }
}
