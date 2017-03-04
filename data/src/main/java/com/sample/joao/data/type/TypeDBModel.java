package com.sample.joao.data.type;

import com.sample.joao.data.task.TaskDBModel;

/**
 * Tabela TypeDBModel usada para classificar uma {@link TaskDBModel}
 */
public class TypeDBModel {
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}