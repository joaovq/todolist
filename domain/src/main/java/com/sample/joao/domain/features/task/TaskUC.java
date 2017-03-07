package com.sample.joao.domain.features.task;

import com.sample.joao.data.features.task.ITaskRepository;
import com.sample.joao.data.features.task.TaskDBModel;
import com.sample.joao.data.features.task.TaskRepository;
import com.sample.joao.domain.interactor.BaseUseCase;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link ITaskUC} que salva um novo {@link TaskDomainModel} no banco de dados
 */
public class TaskUC extends BaseUseCase implements ITaskUC {
    TaskDomainMapper taskDomainMapper;

    public TaskUC(){
        taskDomainMapper = new TaskDomainMapper();
    }

    @Override
    public void save(ITaskRepository repository, TaskDomainModel domainModel) {
        if(repository instanceof TaskRepository){
            TaskDBModel taskDBModel = new TaskDBModel();
            taskDBModel.setTitle(domainModel.getTitle());
            taskDBModel.setDescription(domainModel.getDescription());
            taskDBModel.setPriority(domainModel.getPriority());
            taskDBModel.setDate(domainModel.getDate());

            repository.save(taskDBModel);
        }
    }

    @Override
    public void get(ITaskRepository taskRepository) {
        if(taskRepository instanceof TaskRepository){
            List<TaskDomainModel> models = new ArrayList<TaskDomainModel>();
            for(TaskDBModel taskDBModel : taskRepository.getAllTaks()){
                TaskDomainModel taskDomainModel = taskDomainMapper.map(taskDBModel);
                if(taskDomainModel != null)
                    models.add(taskDomainModel);
            }
            fireOnNext(models);
        }
    }
}
