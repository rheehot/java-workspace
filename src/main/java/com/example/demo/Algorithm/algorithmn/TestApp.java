package com.example.demo.Algorithm.algorithmn;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Geonguk Han
 * @since 2020-08-24
 */
public class TestApp {
    public static void main(String[] args) {
        final List<Integer> collect = IntStream.range(1, 11).boxed().collect(Collectors.toList());

        // O(n)
        int sum = 0;
        for (int i = 0; i < collect.size(); i++) {
            sum += collect.get(i);
        }

        System.out.println(sum);


        // 처음값 + 중간값 계산
        int midSum = collect.get(0) + collect.get(collect.size() - 1);
        int result = midSum * (collect.size() / 2);
        System.out.println(result);


        // 한가지 값이 빠져있을때 어떻게 탐색?
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 10};

        int sum2 = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum2 += intArray[i];
        }
        System.out.println(55 - sum2);


    }
}
