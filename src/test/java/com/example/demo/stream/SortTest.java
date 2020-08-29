package com.example.demo.stream;

import com.google.gson.GsonBuilder;
import lombok.Data;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Geonguk Han
 * @since 2020-08-28
 */
public class SortTest {

    private List<String> sampleStrings;

    @BeforeEach
    void setUp() {
        sampleStrings = Arrays.asList("this", "is", "a", "list", "of", "strings");

    }

    @Test
    void sort() {
        // 방법 1 람다
        final List<String> collect = sampleStrings.stream()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .collect(Collectors.toList());

        System.out.println(collect);

        // 방법 2  정적 메서드
        final List<String> collect1 = sampleStrings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println(collect1);

    }

    @Test
    void comparing_sort() {

        List<Golfer> golfers = Arrays.asList(
                new Golfer("Jack", "Nicklaus", 68),
                new Golfer("Tiger", "Woods", 70),
                new Golfer("Tom", "Watson", 70),
                new Golfer("Ty", "Webb", 68),
                new Golfer("Bubba", "Watson", 70)
        );

        final List<Golfer> collect = golfers.stream()
                .sorted(Comparator.comparing(Golfer::getScore)
                        .thenComparing(Golfer::getFirstname)
                        .thenComparing(Golfer::getLastname))
                .collect(Collectors.toList());

        print(collect);

    }


    public void print(Object result) {
        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(result));
    }

    @Data
    class Golfer {
        private String firstname;
        private String lastname;
        private int score;

        public Golfer(String firstname, String lastname, int score) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.score = score;
        }

    }
}
