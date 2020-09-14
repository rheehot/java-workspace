package com.example.demo.tobyReativeStream;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Geonguk Han
 * @since 2020-09-14
 */
public class PubSub {
    public static void main(String[] args) {

        Iterable<Integer> iter = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // publisher
        Publisher<Integer> publisher = new Publisher<Integer>() {

            Iterator<Integer> it = iter.iterator();

            @Override
            public void subscribe(Subscriber<? super Integer> subscriber) {

                subscriber.onSubscribe(new Subscription() {

                    // backPressure
                    @Override
                    public void request(long l) {
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
                this.subscription = subscription;
                this.subscription.request(1);

            }

            // * (0..무한)
            @Override
            public void onNext(Integer integer) {
                System.out.println("onNext :" + integer);
                this.subscription.request(1);

            }

            // optional
            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError : " + throwable);
            }

            // optional
            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };


        publisher.subscribe(subscriber);


    }
}
