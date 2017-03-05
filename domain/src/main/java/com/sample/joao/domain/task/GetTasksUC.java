package com.sample.joao.domain.task;

import com.sample.joao.data.task.ITaskRepository;
import com.sample.joao.data.task.TaskDBModel;
import com.sample.joao.data.task.TaskRepository;
import com.sample.joao.domain.others.interactor.BaseUseCase;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link IGetTasksUC} que obtém dados do banco e retorna {@link TaskDomainModel}
 */
public class GetTasksUC extends BaseUseCase implements IGetTasksUC {
    TaskDomainMapper taskDomainMapper;

    public GetTasksUC(){
        taskDomainMapper = new TaskDomainMapper();
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
