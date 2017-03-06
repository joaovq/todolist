package com.sample.joao.todolist.activity;

import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.sample.joao.todolist.R;
import com.sample.joao.todolist.utils.DrawerLayoutUtils;

/**
 * Classe base {@link android.app.Activity} para todas as atividades nessa app
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initToolbar();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = DrawerLayoutUtils.get(this);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    /**
     * Inicializa barra de status
     */
    private void initToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    /**
     * Encontra barra de status do app
     * @return Referência para uma {@link android.support.v7.widget.Toolbar}
     */
    protected Toolbar getToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        return toolbar;
    }
}
