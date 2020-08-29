package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

import java.util.*;

/**
 * @author Geonguk Han
 * @since 2020-08-26
 */
public class A17_GroupAnagrams {

    public static void main(String[] args) {

        String[] list = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(solve(list));
    }

    private static List<List<String>> solve(String[] str) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            final String string = str[i]; // eat
            final char[] chars = string.toCharArray();
            Arrays.sort(chars); // aet

            if (map.containsKey(String.valueOf(chars))) {
                map.get(String.valueOf(chars)).add(string);
            } else {
                List<String> subList = new ArrayList<>();
                subList.add(string);
                map.put(String.valueOf(chars), subList);
            }
        }

        result.addAll(map.values());

        return result;
    }
}
