package com.sample.joao.domain.task;

import com.sample.joao.data.task.ITaskRepository;

/**
 * Interface que representa um interador responsável por comunicar com a camada de dados
 */
public interface IGetTasksUC {
    void get(ITaskRepository taskRepository);
}
