package com.example.demo.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @author Geonguk Han
 * @since 2020-08-31
 */
public class ParallelStreamTest {

    @Test
     void isParallelStream() {
        List<Long> alist = new ArrayList<>();
        final Stream<Long> longStream = alist.parallelStream();
        assertTrue(longStream.isParallel());
    }


    @Test
    void name() throws ExecutionException, InterruptedException {

        long firstNum = 1;
        long lastNum = 1_000_000;

        List<Long> aList = LongStream.rangeClosed(firstNum, lastNum).boxed()
                .collect(Collectors.toList());

        ForkJoinPool customThreadPool = new ForkJoinPool(4);
        long actualTotal = customThreadPool.submit(
                () -> aList.parallelStream().reduce(0L, Long::sum)).get();

        /*final Long actualTotal = aList.stream()
                .reduce(0L, Long::sum);*/

        assertEquals((lastNum + firstNum) * lastNum / 2, actualTotal);

    }
}
