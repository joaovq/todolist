package com.sample.joao.todolist.features.task;

import com.sample.joao.todolist.view.IBaseView;

/**
 * Interface que representa métodos usados para adicionar e atualizar os dados
 * do usuário
 */
public interface ITaskView extends IBaseView {
    String  getTitle();
    String  getDescription();
    Integer getPriority();
    String  getDate();

    void    saveSucessfully(Long taskId);
    void    updateSucefully(Long taskId);
}
