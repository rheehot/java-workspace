package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Andrew
 * @since 2020-08-26
 */
public class A15_FindAnagramMapping {

    public static void main(String[] args) {
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};
        int[] result = anagramMappings(A, B);
        System.out.println(Arrays.toString(result));

    }

    private static int[] anagramMappings(int[] a, int[] b) {
        int[] result = new int[a.length];


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(b[i], i);
        }

        System.out.println(map);

        for (int i = 0; i < a.length; i++) {
            result[i] = map.get(a[i]);

        }
        return result;
    }
}
