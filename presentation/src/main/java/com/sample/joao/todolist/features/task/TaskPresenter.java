package com.sample.joao.todolist.features.task;

import com.sample.joao.data.features.task.TaskRepository;
import com.sample.joao.domain.features.task.SaveTaskInvoker;
import com.sample.joao.domain.features.task.TaskDomainModel;
import com.sample.joao.todolist.presenter.BasePresenter;

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
