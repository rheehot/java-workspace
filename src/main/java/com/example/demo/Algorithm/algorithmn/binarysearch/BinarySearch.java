package com.example.demo.Algorithm.algorithmn.binarysearch;

/**
 * @author Geonguk Han
 * @since 2020-04-11
 */
public class BinarySearch {

    /**
     * return index
     *
     * @param intArrays
     * @param target
     * @return
     */
    public static int solve(int[] intArrays, int target) {
        int lower = 0;
        int upper = intArrays.length;

        while (lower <= upper) {
            int middle = (lower + upper) / 2;
            if (target == intArrays[middle]) {
                return middle;
            } else if (target > intArrays[middle]) {
                lower = middle + 1;
            } else {
                upper = middle - 1;
            }
        }

        return -1;
    }

    public static int solve2(int[] ints, int target) {
        int lower = 0;
        int upper = ints.length;
        while (lower <= upper) {
            int middle = (lower + upper) / 2;
            // 중간값이랑 같으면 리턴
            if (ints[middle] == target) {
                return middle;
            } else if (ints[middle] < target) {
                lower = middle + 1;
            } else {
                upper = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // 항상 정렬되어 있어야 한다.
        int[] intArrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 20, 30, 50};

        System.out.println(solve2(intArrays, 20));


    }
}
