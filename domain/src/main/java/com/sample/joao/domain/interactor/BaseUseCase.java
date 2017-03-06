package com.sample.joao.domain.interactor;

import com.sample.joao.domain.invoker.BaseInvoker;

import java.util.ArrayList;

/**
 * Interador base
 */
public class BaseUseCase {

    protected ArrayList<BaseInvoker> invokers;

    public BaseUseCase() {
        invokers = new ArrayList<>();
    }


    public void subscribe(BaseInvoker subscriber) {
        invokers.add(subscriber);
    }

    public void fireOnNext(Object obj) {
        for (int i = 0; i < invokers.size(); i++) {
            invokers.get(i).onNext(obj);
        }
    }

}
