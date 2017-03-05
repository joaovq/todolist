package com.sample.joao.domain.task;

import com.sample.joao.common.Mapper;
import com.sample.joao.data.task.TaskDBModel;

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
        taskDBModel.setStatus(taskDBModel.getStatus());
        taskDBModel.setDate(taskDBModel.getDate());
        taskDBModel.setId(taskDBModel.getId());
        taskDBModel.setLabel(taskDBModel.getLabel());
        taskDBModel.setType(taskDBModel.getType());

        return taskDomainModel;
    }
}
