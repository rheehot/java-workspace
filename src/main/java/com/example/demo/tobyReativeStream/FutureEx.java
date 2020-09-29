package com.example.demo.tobyReativeStream;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Geonguk Han
 * @since 2020-09-29
 */
@Slf4j
public class FutureEx {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newCachedThreadPool();

        final Future<String> future = es.submit(() -> {
            log.info("async");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello";
        });

        // main thread에서 가져옴, blocking 된다.
        System.out.println(future.get());

        log.info("exit");
    }
}
