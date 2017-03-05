package com.sample.joao.todolist.task;

import com.sample.joao.domain.type.TypdeDomainModel;
import com.sample.joao.todolist.label.LabelViewModel;
import com.sample.joao.todolist.type.TypdeViewModel;

import java.util.Date;

/**
 * Tabela TaskViewModel usada para armazenar as tarefas a serem feitas
 */
public class TaskViewModel {
    String title;
    String description;
    Integer status;
    Integer priority;
    Date date;
    LabelViewModel labelViewModel;
    TypdeViewModel typdeViewModel;

    public LabelViewModel getLabelViewModel() {
        return labelViewModel;
    }

    public void setLabelViewModel(LabelViewModel labelViewModel) {
        this.labelViewModel = labelViewModel;
    }

    public TypdeViewModel getTypdeViewModel() {
        return typdeViewModel;
    }

    public void setTypdeViewModel(TypdeViewModel typdeViewModel) {
        this.typdeViewModel = typdeViewModel;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
