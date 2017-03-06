package com.sample.joao.todolist.features.task;

import com.sample.joao.common.Mapper;
import com.sample.joao.data.features.task.TaskDBModel;
import com.sample.joao.domain.features.task.TaskDomainModel;

/**
 * Mapper usado para transformar {@link TaskDomainModel} (na camada de dados) em um
 * {@link TaskViewModel}
 */
public class TaskViewMapper implements Mapper<TaskDomainModel,TaskViewModel> {

    @Override
    public TaskViewModel map(TaskDomainModel taskDomainModel1) {
        TaskViewModel taskViewModel = new TaskViewModel();
        taskViewModel.setTitle(taskDomainModel1.getTitle());
        taskViewModel.setDescription(taskDomainModel1.getDescription());
        taskViewModel.setPriority(taskDomainModel1.getPriority());
        taskViewModel.setStatus(taskDomainModel1.getStatus());
        taskViewModel.setDate(taskDomainModel1.getDate());

        return taskViewModel;
    }
}
