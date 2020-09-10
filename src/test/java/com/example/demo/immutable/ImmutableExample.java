package com.example.demo.immutable;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Geonguk Han
 * @since 2020-09-09
 */
public class ImmutableExample {

    @Test
    void immutable() {

        IntStream.range(0, 10).forEach(System.out::println);


        // Math.randome() 0.0 ~ 1.0
        IntStream.generate(() -> (int) (Math.random() * 1000)).limit(100).forEach(System.out::println);


        // jdk8
        final List<Integer> integers = Arrays.asList(1, 2, 3);
        final List<Integer> immutableList = Collections.unmodifiableList(integers);

        // jdk9
//        final List<Integer> immutableIntegerList = List.of(1, 2, 3);

    }
}
