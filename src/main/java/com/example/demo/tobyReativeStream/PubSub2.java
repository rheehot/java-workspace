package com.example.demo.tobyReativeStream;

import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Geonguk Han
 * @since 2020-09-15
 */
@Slf4j
public class PubSub2 {

    public static void main(String[] args) {
        Publisher<Integer> pub = pub(iter());
        Publisher<Integer> mapPub = mapPub(pub, (Function<Integer, Integer>) i -> i * 10);
//        Publisher<Integer> sumPub = sumPub(pub);
        mapPub.subscribe(logSub());
    }

    /*private static Publisher<Integer> sumPub(Publisher<Integer> pub) {
        return new Publisher<Integer>() {
            @Override
            public void subscribe(Subscriber<? super Integer> subscriber) {
                pub.subscribe(new DelegateSubscriber(subscriber) {

                    int sum = 0;

                    @Override
                    public void onNext(Integer integer) {
                        sum += integer;
                    }

                    @Override
                    public void onComplete() {
                        subscriber.onNext(sum);
                        subscriber.onComplete();
                    }
                });
            }
        };
    }*/

    private static List<Integer> iter() {
        return Stream.iterate(1, a -> a + 1).limit(10).collect(Collectors.toList());
    }

    private static <T> Publisher<T> mapPub(Publisher<T> pub, Function<T, T> function) {
        return new Publisher<T>() {
            @Override
            public void subscribe(Subscriber<? super T> subscriber) {
                pub.subscribe(new DelegateSubscriber<T>(subscriber) {
                    @Override
                    public void onNext(T integer) {
                        subscriber.onNext(function.apply(integer));
                    }
                });
            }
        };
    }

    private static Subscriber<Integer> logSub() {
        return new Subscriber<Integer>() {
            @Override
            public void onSubscribe(Subscription subscription) {
                log.debug("onSubscribe");
                subscription.request(5);

            }

            @Override
            public void onNext(Integer integer) {
                log.debug("onNext :{} ", integer);
            }

            @Override
            public void onError(Throwable throwable) {
                log.debug("onError:{}", throwable);
            }

            @Override
            public void onComplete() {
                log.debug("onComplete");
            }
        };
    }


    private static Publisher<Integer> pub(Iterable<Integer> iter) {
        return new Publisher<Integer>() {
            @Override
            public void subscribe(Subscriber<? super Integer> subscriber) {
                subscriber.onSubscribe(new Subscription() {
                    @Override
                    public void request(long l) {

                        try {
                            iter.forEach(v -> subscriber.onNext(v));
                            subscriber.onComplete();
                        } catch (Throwable t) {
                            log.debug("Throwable :{}", t);
                        }
                    }

                    @Override
                    public void cancel() {

                    }
                });
            }
        };
    }
}
