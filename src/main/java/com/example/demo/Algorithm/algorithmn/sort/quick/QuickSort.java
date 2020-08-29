package com.example.demo.Algorithm.algorithmn.sort.quick;

import java.util.Arrays;

/**
 * @author Andrew
 * @since 2020-08-27
 */
public class QuickSort {
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

    public static int partition(int[] array, int left, int right) {
        int mid = (left + right) / 2;
        swap(array, left, mid);

        System.out.println("after swap : " + Arrays.toString(array));

        int pivot = array[left];
        int i = left, j = right;

        System.out.println("curretn pivot: " + pivot);
        System.out.println(">>>>>>left: " + i + ", right :" + j);

        while (i < j) {
            System.out.println("포인터 : i: " + i + ", j: " + j);
            // 피봇보다 큰 값이면, 오른쪽에 위치하고, 점점 줄여 나간다.
            while (pivot < array[j]) {
                j--;
            }

            // 피봇보다 작은 값이면, 왼쪽에 위치하고, 점점 늘려나간다.
            while (i < j && pivot >= array[i]) {
                i++;
            }

            // 그리고 swap 한다.
            swap(array, i, j);
            System.out.println("||||||| after swap: " + Arrays.toString(array));
        }

        array[left] = array[i];
        array[i] = pivot;

        System.out.println("array[left] = " + array[i] + ", array[i] =" + pivot);
        System.out.println("return i: " + i);
        return i;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
