package com.sample.joao.data.label;

import com.orm.SugarRecord;
import com.sample.joao.data.task.TaskDBModel;

/**
 * Tabela LabelDBModel usada para classificar uma {@link TaskDBModel}
 */
public class LabelDBModel extends SugarRecord {
    String title;
    Integer color;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }
}
