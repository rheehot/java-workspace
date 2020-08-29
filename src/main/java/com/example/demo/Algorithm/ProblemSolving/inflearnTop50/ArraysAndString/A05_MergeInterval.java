package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.ArraysAndString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @since 2020-08-15
 */

class Interval {
    int start;
    int end;

    public Interval() {
    }

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return this.start + " " + this.end;
    }
}

public class A05_MergeInterval {
    public static void main(String[] args) {
        //		int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
        Interval in1 = new Interval(1, 3);
        Interval in2 = new Interval(2, 6);
        Interval in3 = new Interval(8, 10);
        Interval in4 = new Interval(15, 18);

        List<Interval> intervals = new ArrayList<>();
        intervals.add(in2);
        intervals.add(in1);
        intervals.add(in3);
        intervals.add(in4);

        List<Interval> list = merge(intervals);

        System.out.println(list);

    }

    private static List<Interval> merge(List<Interval> intervals) {
        if (intervals.isEmpty()) return intervals;

        // sorting with comparator (lambda)
        Collections.sort(intervals, (a, b) -> a.start - b.end);

        // result
        List<Interval> result = new ArrayList<>();

        Interval before = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if (before.end >= current.start) {
                before.end = Math.max(before.end, current.end);
            } else {
                result.add(before);
                before = current;
            }
        }
        if (!result.contains(before)) {
            result.add(before);
        }

        return result;
    }

}
