package com.example.demo.Algorithm.algorithmn.heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author Geonguk Han
 * @since 2020-08-03
 */
public class PriorityQueueExample {

    public static void main(String[] args) {

        // tree 구조
        //  400
        // 30 20
        //10
        final PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); //파라미터 그냥 sort 하면 min heap
        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(20);
        maxHeap.add(400);


        // print all
        for (Integer integer : maxHeap) {
            System.out.println(integer);
        }

        // remove root node
        final Integer poll = maxHeap.poll();
        System.out.println("remove root node value : " + poll);


        // 30
        //10 20
        for (Integer integer : maxHeap) {
            System.out.println(integer);

        }

    }
}
