package com.example.demo.tobyReativeStream;


import lombok.extern.slf4j.Slf4j;

import java.util.Objects;
import java.util.concurrent.*;

/**
 * @author Geonguk Han
 * @since 2020-09-29
 */
@Slf4j
public class FutureEx2 {

    interface SuccessCallBack {
        void onSuccess(String str);
    }

    interface ExceptionCallBack {
        void onError(Throwable t);
    }

    private static class CallableFutureTask extends FutureTask<String> {
        SuccessCallBack sc;
        ExceptionCallBack ec;

        public CallableFutureTask(Callable<String> callable, SuccessCallBack sc, ExceptionCallBack ec) {
            super(callable);
            this.sc = Objects.requireNonNull(sc);
            this.ec = Objects.requireNonNull(ec);
        }

        @Override
        protected void done() {
            try {
                sc.onSuccess(get());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();

            } catch (ExecutionException e) {
                ec.onError(e.getCause());
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {

        ExecutorService es = Executors.newCachedThreadPool();

        final CallableFutureTask f = new CallableFutureTask(() -> {
            log.info("async");
            if (1==1) throw new RuntimeException("Async Error!!");

            Thread.sleep(2000);
            return "hello";
            },
                s -> log.info("result : " + s),
                e -> log.info("error: " + e.getMessage() +"")

        );

        log.info("before execute");
        es.execute(f);

        Thread.sleep(1000);
        log.info("exit");

    }
}
