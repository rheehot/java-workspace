package com.example.demo.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Geonguk Han
 * @since 2020-08-28
 */
public class PartitioningTest {
    @Test
    void partitioningTest() {
        List<String> strings = Arrays.asList("this", "is", "a", "long", "list", "of",
                "strings", "to", "use", "as", "a", "demo");

        //짝, 홀수로 파티셔닝해봐라

        final Map<Boolean, List<String>> collect = strings.stream()
                .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0));

        System.out.println(collect);

        final List<String> strings1 = collect.get(true);
        System.out.println(strings1);

    }
}
