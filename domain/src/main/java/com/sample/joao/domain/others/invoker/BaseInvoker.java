package com.sample.joao.domain.others.invoker;

import rx.Subscriber;

/**
 * Invoker base usado para implementar subscriber
 */
public abstract class BaseInvoker <T> extends Subscriber<T> {
    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {

    }

}
