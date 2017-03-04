package com.sample.joao.data.task;

import com.orm.SugarRecord;
import com.sample.joao.data.label.LabelDBModel;
import com.sample.joao.data.type.TypeDBModel;

import java.util.Date;

/**
 * Tabela TaskDBModel usada para armazenar as tarefas a serem feitas
 */
public class TaskDBModel extends SugarRecord {
    String title;
    String description;
    Integer status;
    Integer priority;
    Date date;
    LabelDBModel label;
    TypeDBModel type;

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
