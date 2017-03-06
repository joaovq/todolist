package com.sample.joao.data.features.task;

import com.orm.SugarRecord;
import com.sample.joao.data.features.label.LabelDBModel;
import com.sample.joao.data.features.type.TypeDBModel;

/**
 * Tabela TaskDBModel usada para armazenar as tarefas a serem feitas
 */
public class TaskDBModel extends SugarRecord {
    String title;
    String description;
    Integer status;
    Integer priority;
    String date;
    LabelDBModel label;
    TypeDBModel type;

    public TaskDBModel() { }

    public LabelDBModel getLabel() {
        return label;
    }

    public void setLabel(LabelDBModel label) {
        this.label = label;
    }

    public TypeDBModel getType() {
        return type;
    }

    public void setType(TypeDBModel type) {
        this.type = type;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
