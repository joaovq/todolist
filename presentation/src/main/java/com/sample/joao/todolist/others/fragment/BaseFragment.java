package com.sample.joao.todolist.others.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sample.joao.todolist.others.presenter.BasePresenter;

import butterknife.ButterKnife;

/**
 * Fragmento base usado por todos os outros fragmentos
 */
public abstract class BaseFragment<P extends BasePresenter> extends Fragment {

    protected P presenter;
    View rootView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(getLayoutId(), container, false);

        ButterKnife.bind(this, rootView);
        if (presenter == null) {
            presenter = createPresenter();
            presenter.initView(this);
        }
        return rootView;
    }

    protected abstract P createPresenter();

    protected abstract int getLayoutId();

}
