package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * ✅ check
 *
 * @since 2020-08-16
 */
public class A09_KCloset {
    public static void main(String[] args) {

        int[][] points = {{1, 3}, {-2, 2}};
        int k = 1;

        print2(solve(points, k));


    }

    private static int[][] solve(int[][] points, int k) {
//        int[][] result = new int[k][2];
        int[][] result = new int[1][2];


        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> (a[0] * a[0] + a[1] * a[1])));

        for (int[] i : points) {
            queue.offer(i);
        }


        int index = 0;
        while (index < k) {
            result[index] = queue.poll();
            index++;
        }

        return result;
    }

    private static void print2(int[][] solve) {
        for (int i = 0; i < solve.length; i++) {
            System.out.println(Arrays.toString(solve[i]));
        }
    }

    private static void print(Queue<int[]> queue) {
        System.out.println("queue size:" + queue.size());
        int[] poll1;
        while (!queue.isEmpty()) {
            poll1 = queue.poll();
            System.out.println(Arrays.toString(poll1));
        }
    }


}
