package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @since 2020-08-15
 */
public class A06_MeetingRoom2 {

    public static void main(String[] args) {
        Interval in1 = new Interval(5, 10);
        Interval in2 = new Interval(15, 20);
        Interval in3 = new Interval(0, 30);
        Interval[] intervals = {in1, in2, in3};

        System.out.println(solve(intervals));
    }

    private static int solve(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        // sort
        Arrays.sort(intervals, (a, b) -> a.start - b.start);

        // 담을 그릇
        Queue<Interval> heap = new PriorityQueue<>(intervals.length, (a, b) -> a.end - b.end);

        // 비교 연산
        heap.offer(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            Interval interval = heap.poll();
            if (interval.end > intervals[i].start) {
                heap.offer(intervals[i]);
            }
            heap.offer(interval);
        }

        System.out.println(heap);

        return heap.size();
    }
}
