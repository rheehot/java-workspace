package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @since 2020-08-12
 */
public class A03_Twosums {

    // 2개를 더해서 target값을 만드는 index +1 을 구하라
    public static void main(String[] args) {
        int[] nums = {2, 8, 11, 21};
        int target = 10;

        // output { 1,2}

        int[] result = solution(nums, target);

        System.out.println(Arrays.toString(result));

    }

    private static int[] solution(int[] nums, int target) {
        // for문 돌면서 값 하나 꺼내서, target - 값을 map에 담는다.
        // map (값, 인덱스)
        // map에 값이 존재하면, 결과값 배열에 담는다.

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Integer value = map.get(nums[i]);
                result[0] = value + 1;
                result[1] = i + 1;

            } else {
                map.put(target - nums[i], i);
            }
        }


        return result;
    }
}
