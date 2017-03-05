package com.sample.joao.domain.task;

import com.sample.joao.data.task.TaskRepository;
import com.sample.joao.domain.others.invoker.BaseInvoker;

/**
 * Invoker usado para intermediar a criaćão de uma tarefa no banco de dados
 */
public class SaveTaskInvoker extends BaseInvoker<Long>{
    TaskUC saveTaskUC;

    public SaveTaskInvoker(TaskRepository taskRepository, TaskDomainModel taskDomainModel) {
        saveTaskUC = new TaskUC();
        saveTaskUC.subscribe(this);

        saveTaskUC.save(taskRepository, taskDomainModel);
    }

    @Override
    public void onNext(Long aLong) {

    }
}
