package com.sample.joao.domain.features.task;

import com.sample.joao.data.features.task.TaskRepository;
import com.sample.joao.domain.invoker.BaseInvoker;

import java.util.ArrayList;

/**
 * Invoker usado para intermediar a pesquisa por tarefas no banco de dados
 */
public class GetTasksInvoker extends BaseInvoker<ArrayList<TaskDomainModel>>{
    TaskUC taskUC;

    public GetTasksInvoker(){
        taskUC = new TaskUC();
        taskUC.subscribe(this);
        taskUC.get(new TaskRepository());
    }

    @Override
    public void onNext(ArrayList<TaskDomainModel> taskDomainModels) {

    }
}
