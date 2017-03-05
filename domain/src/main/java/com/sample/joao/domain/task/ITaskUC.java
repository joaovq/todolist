package com.sample.joao.domain.task;

import com.sample.joao.data.task.ITaskRepository;

/**
 * Interface responsible to retrieve, add or update tasks
 */
public interface ITaskUC {
    void save (ITaskRepository repository, TaskDomainModel domainModel);
    void get(ITaskRepository taskRepository);
}
