package com.sample.joao.domain.features.task;

import com.sample.joao.common.Mapper;
import com.sample.joao.data.features.task.TaskDBModel;

/**
 * Mapper usado para transformar {@link TaskDBModel} (na camada de dados) em um
 * {@link TaskDomainModel}
 */
public class TaskDomainMapper implements Mapper<TaskDBModel,TaskDomainModel> {

    @Override
    public TaskDomainModel map(TaskDBModel taskDBModel) {
        TaskDomainModel taskDomainModel = new TaskDomainModel();
        taskDomainModel.setTitle(taskDBModel.getTitle());
        taskDomainModel.setDescription(taskDBModel.getDescription());
        taskDomainModel.setPriority(taskDBModel.getPriority());
        taskDomainModel.setStatus(taskDBModel.getStatus());
        taskDomainModel.setDate(taskDBModel.getDate());

        return taskDomainModel;
    }
}
