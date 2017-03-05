package com.sample.joao.todolist.others.presenter;

/**
 * Presenter base
 */
public abstract class BasePresenter<V> {

    V view;

    protected V getView() {
        return view;
    }

    public void initView(V view) {
        this.view = view;
    }

}