package com.sample.joao.todolist.features.task;

import com.sample.joao.todolist.view.IBaseView;

import java.util.ArrayList;

/**
 * Interface that represent methods to show data to the user in the UI
 */
public interface IGetTaksView extends IBaseView {
    public void showEmptyData();
    public void showData(ArrayList<TaskViewModel> models);
}
