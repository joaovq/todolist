package com.sample.joao.todolist.task;

import com.sample.joao.domain.task.GetTasksInvoker;
import com.sample.joao.domain.task.TaskDomainModel;
import com.sample.joao.todolist.others.presenter.BasePresenter;

import java.util.ArrayList;

/**
 * Presenter que faz a comunicação entre a view (camada superior) e domain (camada do meio)
 */
public class GetTasksPresenter extends BasePresenter<ITaksView> {
    TaskViewMapper taskViewMapper;

    /**
     * Obtém tarefas salvas na memória local
     */
    public void getTasks(){
        new GetTasksInvoker(){
            @Override
            public void onNext(ArrayList<TaskDomainModel> taskDomainModels){
                taskViewMapper = new TaskViewMapper();
                ArrayList<TaskViewModel> taskViewModels = new ArrayList<>();
                for(TaskDomainModel taskDomainModel : taskDomainModels)
                    taskViewModels.add(taskViewMapper.map(taskDomainModel));

                if(!taskDomainModels.isEmpty())
                    getView().showData(taskViewModels);
                else
                    getView().showEmptyData();
            }
        };
    }
}
