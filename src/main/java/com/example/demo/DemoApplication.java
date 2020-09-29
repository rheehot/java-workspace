package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * spring 에서 비동기 처리하는 방법 @Async로 DB에 저장하고
 * 주기적으로 DB를 찔러서 완료했는지 ?
 *
 * HttpSession에 담아서 Controller에 전달할 수도 있다.
 *
 */
@SpringBootApplication
@Slf4j
@EnableAsync
public class DemoApplication {

    @Component
    public static class MyService{

        /**
         * java - Future
         * spring - ListenableFuture (callback 작업을 쉽게)
         *
         * @return
         * @throws InterruptedException
         */
        @Async(value = "threadPoolTaskExecutor")
        public ListenableFuture<String> hello() throws InterruptedException {

            log.info("hello() ");

            Thread.sleep(1000);
            return new AsyncResult<>("hello");
        }
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    MyService myService;

    @Bean
    ApplicationRunner run() {
        return args -> {
            log.info("run()");
            final ListenableFuture<String> hello = myService.hello();
            // callback 등록
            hello.addCallback(s -> System.out.println(s), e -> System.out.println(e.getCause()));

            log.info("result : " + hello.isDone());

            log.info("exit");

        };

    }


    @Bean
    ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        // core 꽉차면 -> queue가 차고 꽉차면 -> max pool 사이즈까지 늘려줌
        // database connection과 다름

        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(10);
        taskExecutor.setMaxPoolSize(100);
        taskExecutor.setQueueCapacity(200);
        taskExecutor.setThreadNamePrefix("my thread");
        taskExecutor.initialize();

        return taskExecutor;
    }
}
