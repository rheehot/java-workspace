package com.example.demo.tobyReativeStream;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * @author Geonguk Han
 * @since 2020-09-29
 *
 *
 * 1. Future java5부터 비동기 결과값을 담는 용도의 인터페이스
 * 비동기는 결국 다른 thread 에서 돌리고 얻어온 결과값을 메인 스레드에서 얻어올때 사용함
 *
 *
 * 2. Callback
 *
 */

@Slf4j
public class FutureEx {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newCachedThreadPool();

        FutureTask<String> f = new FutureTask<String>(() -> {
            log.info("async");
            return "hello";
        }){
            @Override
            protected void done() {
                try {
                    System.out.println(get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        };

        /*final Future<String> future = es.submit(() -> {
            log.info("async");
            return "hello";
        });*/

        es.execute(f);

        log.info("exit");
        System.out.println(f.get()); // blocking



    }
}
