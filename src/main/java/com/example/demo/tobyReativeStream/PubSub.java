package com.example.demo.tobyReativeStream;

import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Geonguk Han
 * @since 2020-09-14
 */
@Slf4j
public class PubSub {
    public static void main(String[] args) {

//        Iterable<Integer> iter = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Iterable<Integer> iter = Stream.iterate(1, a -> a + 1).limit(10).collect(Collectors.toList());

        // publisher
        Publisher<Integer> publisher = new Publisher<Integer>() {
            Iterator<Integer> it = iter.iterator();

            @Override
            public void subscribe(Subscriber<? super Integer> subscriber) {
                subscriber.onSubscribe(new Subscription() {
                    @Override
                    public void request(long l) {
                        // backPressure
                        while (l-- > 0) {
                            if (it.hasNext()) {
                                subscriber.onNext(it.next());
                            }else {
                                subscriber.onComplete();
                                break;
                            }
                        }
                    }

                    @Override
                    public void cancel() {

                    }
                });
            }

        };

        // subscriber
        Subscriber<Integer> subscriber = new Subscriber<Integer>() {

            Subscription subscription;
            // 필수
            @Override
            public void onSubscribe(Subscription subscription) {
                System.out.println("onSubscribe");
                log.debug("onSubscribe");
                this.subscription = subscription;
                this.subscription.request(1);

            }

            // * (0..무한)
            @Override
            public void onNext(Integer integer) {
                log.debug("onNext:{}", integer);
                this.subscription.request(1);

            }

            @Override
            public void onError(Throwable throwable) {
                log.debug("onError :{}", throwable);
            }

            @Override
            public void onComplete() {
                log.debug("onComplete");
            }
        };
        publisher.subscribe(subscriber);
    }
}
