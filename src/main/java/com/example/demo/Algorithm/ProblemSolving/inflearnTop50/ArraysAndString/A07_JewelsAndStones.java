package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

import java.util.HashSet;
import java.util.Set;

/**
 * @since 2020-08-16
 */
public class A07_JewelsAndStones {
    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";
        System.out.println(solve(J, S));
    }

    private static int solve(String j, String s) {
        Set<Character> set = new HashSet<>();
        for (Character c : j.toCharArray()) {
            set.add(c);
        }

        System.out.println(set);//a, A

        int count = 0;
        for (Character c : s.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }

        return count;
    }
}
