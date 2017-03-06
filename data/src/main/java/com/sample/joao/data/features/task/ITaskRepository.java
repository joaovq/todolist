package com.sample.joao.data.features.task;

import java.util.ArrayList;

/**
 * Interface que representa um repositório que gerencia os dados de uma {@link TaskDBModel}
 */
public interface ITaskRepository {
    /**
     * Salva uma nova {@link TaskDBModel}
     * @param task Modelo com os dados que serão salvos
     */
    void save(TaskDBModel task);

    /**
     * Atualiza uma {@link TaskDBModel}
     * @param task Modelo com os dados que serão atualizados
     */
    void update(TaskDBModel task);

    /**
     * Obtém o id de uma {@link TaskDBModel}
     * @return Id da {@link TaskDBModel} selecionada
     */
    long getTaskId();

    /**
     * Obtém uma {@link TaskDBModel} com um determinado id
     * @param id
     * @return
     */
    TaskDBModel getTask(long id);

    /**
     * Obtém todas as {@link TaskDBModel} salvas na memória local
     * @return Lista de {@link TaskDBModel}
     */
    ArrayList<TaskDBModel> getAllTaks();
}
