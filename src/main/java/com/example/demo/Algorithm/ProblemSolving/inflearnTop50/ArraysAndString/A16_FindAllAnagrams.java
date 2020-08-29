package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrew
 * @since 2020-08-26
 */
public class A16_FindAllAnagrams {
    public static void main(String[] args) {
        String txt = "BACDGABCDA";
        String pat = "ABCD";
        System.out.println(solve(txt, pat));

        int[] ints = new int[128];
        char a = 'A';

    }

    private static List<Integer> solve(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        if (text == null || text.length() == 0 || pattern == null || pattern.length() == 0) {
            return result;
        }

        int[] patternArray = new int[128];
        for (int i = 0; i < pattern.length(); i++) {
            patternArray[pattern.charAt(i)]++;
        }

        for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
            int[] textArry = new int[128];
            for (int j = 0; j < pattern.length(); j++) {
//                textArry[]
            }

        }

        return result;
    }
}
