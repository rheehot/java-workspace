package com.example.demo.tobyReativeStream;

import reactor.core.publisher.Flux;

/**
 * @author Geonguk Han
 * @since 2020-09-15
 */
public class ReactorEx {

    public static void main(String[] args) {
        Flux.<Integer>create(e -> {
            e.next(1);
            e.next(2);
        })
                .log()
                .subscribe(System.out::println);
    }
}
