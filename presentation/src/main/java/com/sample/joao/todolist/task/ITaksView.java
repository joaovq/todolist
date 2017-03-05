package com.sample.joao.todolist.task;

import java.util.ArrayList;

/**
 * Interface que representa métodos usados para apresentar dados
 * para o usuário
 */
public interface ITaksView {
    public void showEmptyData();
    public void showData(ArrayList<TaskViewModel> models);
}
