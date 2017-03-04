package com.sample.joao.domain.task;

import com.sample.joao.common.Mapper;
import com.sample.joao.data.task.TaskDBModel;

/**
 * Mapper usado para transformar {@link TaskDBModel} (na camada de dados) em um
 * {@link TaskDomainModel}
 */
public class TaskDomainMapper implements Mapper<TaskDBModel,TaskDomainModel> {
    @Override
    public TaskDomainModel map(TaskDBModel model) {
        return null;
    }
}
