package com.sample.joao.todolist.task;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.sample.joao.todolist.R;
import com.sample.joao.todolist.others.DialogsUtils;
import com.sample.joao.todolist.others.fragment.BaseFragment;

import java.util.ArrayList;

import butterknife.Bind;

/**
 * Fragmento que apresenta uma lista com as tarefas
 */
public class TasksFragment extends BaseFragment<GetTasksPresenter> implements IGetTaksView {
    @Bind(R.id.recyclerview_task)
    RecyclerView tasksRecyclerView;

    @Bind(R.id.view_no_task)
    View noTasksView;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initUi();
        presenter.getTasks();
    }

    private void initUi() {
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        tasksRecyclerView.setLayoutManager(layoutManager);

        ((MainActivity) getActivity()).setActionBarTitle("Tarefas");
    }

    @Override
    protected GetTasksPresenter createPresenter() {
        return new GetTasksPresenter();
    }

    @Override
    protected int getLayoutId() { return R.layout.fragment_main; }

    @Override
    public void showProgress(String title, String message) { DialogsUtils.showProgress(getContext(),title,message); }

    @Override
    public void hideProgress() { DialogsUtils.hideProgress(); }

    @Override
    public void showError(String error) { }

    @Override
    public void showMessage(String message) { }

    @Override
    public void showEmptyData() {
        noTasksView.setVisibility(View.VISIBLE);
    }

    @Override
    public void showData(ArrayList<TaskViewModel> models) {
        noTasksView.setVisibility(View.GONE);
        tasksRecyclerView.setVisibility(View.VISIBLE);

        TasksAdapter adapter = new TasksAdapter(models);
        tasksRecyclerView.setAdapter(adapter);
    }
}
