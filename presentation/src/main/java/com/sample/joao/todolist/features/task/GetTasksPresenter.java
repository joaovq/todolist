package com.sample.joao.todolist.features.task;

import com.sample.joao.domain.features.task.GetTasksInvoker;
import com.sample.joao.domain.features.task.TaskDomainModel;
import com.sample.joao.todolist.presenter.BasePresenter;

import java.util.ArrayList;

/**
 * Presenter que faz a comunicação entre a view (camada superior) e domain (camada do meio)
 */
public class GetTasksPresenter extends BasePresenter<IGetTaksView> {
    TaskViewMapper taskViewMapper;

    /**
     * Obtém tarefas salvas na memória local
     */
    public void getTasks(){
        getView().showProgress("Obtendo dados","Por favor, aguarde!");
        new GetTasksInvoker(){
            @Override
            public void onNext(ArrayList<TaskDomainModel> taskDomainModels){
                taskViewMapper = new TaskViewMapper();
                ArrayList<TaskViewModel> taskViewModels = new ArrayList<>();
                for(TaskDomainModel taskDomainModel : taskDomainModels)
                    taskViewModels.add(taskViewMapper.map(taskDomainModel));

                getView().hideProgress();

                if(!taskDomainModels.isEmpty())
                    getView().showData(taskViewModels);
                else
                    getView().showEmptyData();
            }
        };
    }
}
