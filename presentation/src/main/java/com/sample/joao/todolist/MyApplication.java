package com.sample.joao.todolist;

import android.app.Application;

import com.orm.SugarContext;

/**
 * Método usado para inicializar dependências do app
 */
public class MyApplication extends Application {
    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        SugarContext.init(this);
        mInstance = this;
    }
    public static synchronized MyApplication getInstance() {
        return mInstance;
    }
}
