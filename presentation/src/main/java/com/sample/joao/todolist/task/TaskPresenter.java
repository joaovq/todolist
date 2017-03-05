package com.sample.joao.todolist.task;

import com.sample.joao.data.task.TaskRepository;
import com.sample.joao.domain.task.SaveTaskInvoker;
import com.sample.joao.domain.task.TaskDomainModel;
import com.sample.joao.todolist.others.presenter.BasePresenter;

import java.util.Date;

/**
 * Presenter que faz a comunicação entre a view (camada superior) e domain (camada do meio)
 */
public class TaskPresenter extends BasePresenter<ITaskView> {

    /**
     * Salva uma nova tarefa com os dados inseridos pelo usuário
     */
    public void saveTask(){
//        getView().showProgress("Salvando","Por favor, aguarde!");

        TaskDomainModel taskDomainModel = new TaskDomainModel();

        String  title       = getView().getTitle();
        String  description = getView().getDescription();
        Integer priority    = getView().getPriority();
        String  date        = getView().getDate();

        taskDomainModel.setTitle(title);
        taskDomainModel.setDescription(description);
        taskDomainModel.setPriority(priority);
        taskDomainModel.setDate(date);

        new SaveTaskInvoker(new TaskRepository(), taskDomainModel){
            @Override
            public void onNext(Long tripId) {
                getView().saveSucessfully(tripId);
//                getView().hideProgress();
            }
        };
    }

    /**
     * Atualiza uma tarefa
     */
    public void updateTask(){

    }
}
