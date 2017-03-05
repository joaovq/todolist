package com.sample.joao.todolist.task;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.view.Menu;
import android.view.MenuItem;

import com.sample.joao.todolist.R;
import com.sample.joao.todolist.others.UiManager;
import com.sample.joao.todolist.others.DrawerLayoutUtils;
import com.sample.joao.todolist.others.activity.BaseActivity;

public class MainActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFloatingBar();

        DrawerLayoutUtils.init(this,getToolbar());

        initNavigationView();

        getFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new TasksFragment(),"MAIN").commit();
    }

    @Override
    public void onBackPressed(){
        Fragment f = getFragmentManager().findFragmentByTag("MAIN");
        if(f instanceof TasksFragment)
            fab.show();
        super.onBackPressed();
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
        DrawerLayoutUtils.onItemSelected(this,id);

        return true;
    }

    /**
     * Set up floating bar to add a new task
     */
    private void initFloatingBar(){
        fab = (FloatingActionButton) findViewById(R.id.fab_new_task);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fab.hide();
                UiManager.loadFragment(new AddTaskFragment(), getFragmentManager(), "OTHER");
//                Snackbar.make(view, "Ir para tela de add", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
    }

    /**
     * Set up navigation drawer
     */
    private void initNavigationView(){
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    /**
     * Set the title of the action bar
     */
    public void setActionBarTitle(String title){
        getToolbar().setTitle(title);
    }
}
