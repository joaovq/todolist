package com.sample.joao.todolist.others;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.sample.joao.todolist.R;

/**
 * Gerenciador do menu lateral da tela principal
 */
public class DrawerLayoutUtils {

    /**
     * Inicializa drawer
     * @param activity Atividade da tela principal
     * @param toolbar barra de status usada no app
     */
    public static void init(AppCompatActivity activity, Toolbar toolbar){
        DrawerLayout drawer = get(activity);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                activity, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
    }
    /**
     * Retorna drawer
     * @param activity Atividade da tela principal
     * @return drawer usado na tela principal
     */
    public static DrawerLayout get(AppCompatActivity activity){
        DrawerLayout drawer = (DrawerLayout) activity.findViewById(R.id.drawer_layout);
        return drawer;
    }

    public static void onItemSelected(AppCompatActivity activity,int id){
        if (id == R.id.nav_settings) {

        }

        DrawerLayout drawer = get(activity);
        drawer.closeDrawer(GravityCompat.START);
    }
}
