package com.sample.joao.domain.features.task;

import com.sample.joao.data.features.task.ITaskRepository;

/**
 * Interface responsible to retrieve, add or update tasks
 */
public interface ITaskUC {
    void save (ITaskRepository repository, TaskDomainModel domainModel);
    void get(ITaskRepository taskRepository);
}
