package com.sample.joao.data.features.task;

import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 * {@link ITaskRepository} that get data from cache or the server
 */
public class TaskRepository implements ITaskRepository {

    @Override
    public void save(TaskDBModel newTask) {
        newTask.save();
    }

    @Override
    public void update(TaskDBModel updatedModel) {
        TaskDBModel taskModel = TaskDBModel.findById(TaskDBModel.class,updatedModel.getId());
        taskModel.setTitle(updatedModel.getTitle());
        taskModel.setDescription(updatedModel.getDescription());
        taskModel.setPriority(updatedModel.getPriority());
        taskModel.setStatus(updatedModel.getStatus());
        taskModel.setDate(updatedModel.getDate());
        taskModel.setLabel(updatedModel.getLabel());
        taskModel.setType(updatedModel.getType());
    }

    @Override
    public TaskDBModel getTask(long id) {
        return TaskDBModel.findById(TaskDBModel.class,id);
    }

    @Override
    public ArrayList<TaskDBModel> getAllTaks() {
        return Lists.newArrayList(TaskDBModel.findAll(TaskDBModel.class));
    }
}
