package com.example.demo.Algorithm.algorithmn.sort.quick;

import java.util.Arrays;

/**
 * @author Andrew
 * @since 2020-08-27
 */
public class QuickSort2 {

    public static void main(String[] args) {
        int[] array = {80, 70, 60, 50, 40, 30, 20};
        quicksort(array, 0, array.length - 1);

        System.out.println("정답: " + Arrays.toString(array));
    }

    public static void quicksort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pi = partition(array, left, right);

        quicksort(array, left, pi - 1);
        quicksort(array, pi + 1, right);
    }

    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        System.out.println("pivot :" + pivot + ", i :" + i + ", end :" + end);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
