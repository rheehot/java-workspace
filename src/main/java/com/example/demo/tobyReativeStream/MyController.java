package com.example.demo.tobyReativeStream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

/**
 * @author Geonguk Han
 * @since 2020-09-29
 */

@RestController
@Slf4j
public class MyController {

    @GetMapping("/callable")
//    public Callable<String> callable() {
//        log.info("callable");
//        // 새로운 스레드에서 실행됨
//        return () -> {
//            log.info("async");
//            Thread.sleep(2000);
//            return "hello";
//        };
//    }

    public String callable() throws InterruptedException {
        log.info("callable");
        Thread.sleep(2000);
        return "hello";
    }
}
