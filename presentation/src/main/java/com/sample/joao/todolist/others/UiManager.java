package com.sample.joao.todolist.others;

import android.app.FragmentManager;

import com.sample.joao.todolist.R;
import com.sample.joao.todolist.others.fragment.BaseFragment;

/**
 * Gerencia widgets usados nas atividades e fragmentos
 */
public class UiManager {
    /**
     * Carrega um novo fragmento na tela
     * @param fragmentToLoad
     * @param fragmentManager
     */
    public static void loadFragment(BaseFragment fragmentToLoad, FragmentManager fragmentManager,String tag) {
        fragmentManager.beginTransaction()
                .replace(R.id.content_frame, fragmentToLoad,tag).addToBackStack(fragmentToLoad.getClass().toString()).commit();
    }
}
