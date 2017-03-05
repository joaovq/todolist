package com.sample.joao.todolist.task;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.view.Menu;
import android.view.MenuItem;

import com.sample.joao.todolist.R;
import com.sample.joao.todolist.others.UiManager;
import com.sample.joao.todolist.others.DrawerLayoutHelper;
import com.sample.joao.todolist.others.activity.BaseActivity;

public class MainActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFloatingBar();

        DrawerLayoutHelper.init(this,getToolbar());

        initNavigationView();

        UiManager.loadFragment(new TasksFragment(), getFragmentManager());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        DrawerLayoutHelper.onItemSelected(this,id);

        return true;
    }

    /**
     * Inicializa floating bar usada para adicionar uma nova tarefa
     */
    private void initFloatingBar(){
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_new_task);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Ir para tela de add", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    /**
     * Inicializa menu de navegação da tela principal
     */
    private void initNavigationView(){
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
}
