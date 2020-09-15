package com.example.demo.tobyReativeStream;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/**
 * @author Geonguk Han
 * @since 2020-09-15
 */
public class DelegateSubscriber<T> implements Subscriber<T> {
    Subscriber subscriber;

    public DelegateSubscriber(Subscriber<? super T> subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        subscriber.onSubscribe(subscription);
    }

    @Override
    public void onNext(T integer) {
        subscriber.onNext(integer);
    }

    @Override
    public void onError(Throwable throwable) {
        subscriber.onError(throwable);
    }

    @Override
    public void onComplete() {
        subscriber.onComplete();
    }
}
