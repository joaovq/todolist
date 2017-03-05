package com.sample.joao.todolist.task;

import com.sample.joao.todolist.others.IBaseView;

import java.util.Date;

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
