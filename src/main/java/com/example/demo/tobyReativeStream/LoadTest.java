package com.example.demo.tobyReativeStream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StopWatch;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Geonguk Han
 * @since 2020-09-29
 */
@Slf4j
public class LoadTest {

    static AtomicInteger counter = new AtomicInteger(0);


    public static void main(String[] args) throws InterruptedException {
        final ExecutorService es = Executors.newFixedThreadPool(100);

        final RestTemplate restTemplate = new RestTemplate();


        String url = "http://localhost:8080/callable";

        final StopWatch stopWatch = new StopWatch();
        stopWatch.start();


        for (int i = 0; i < 100; i++) {
            es.execute(()-> {
                int idx = counter.addAndGet(1);
                log.info("thread :" + idx);

                final StopWatch sw = new StopWatch();
                sw.start();
                restTemplate.getForObject(url, String.class);

                sw.stop();
                log.info("Elapsed " + idx + "-> " + sw.getTotalTimeSeconds());

            });
        }

        es.shutdown();
        es.awaitTermination(100, TimeUnit.SECONDS);

        stopWatch.stop();
        log.info("total :{}", stopWatch.getTotalTimeSeconds());

    }

}
