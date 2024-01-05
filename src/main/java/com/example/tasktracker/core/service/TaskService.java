package com.example.tasktracker.core.service;

import com.example.tasktracker.core.entity.Task;
import com.example.tasktracker.core.interfaces.ITaskService;
import com.example.tasktracker.core.repository.TaskRepository;
import org.springframework.core.task.TaskRejectedException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements ITaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task create(Task task) {
        Task newTask = taskRepository.create(task);
        if (newTask == null){
            return null;
        }else{
            return newTask;
        }
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Task getTask(Long id) {
        return taskRepository.getTask(id).orElseThrow(()-> new TaskRejectedException("Error Occurred"));
    }

    @Override
    public List<Task> listTask() {
        return taskRepository.listTasks();
    }

    @Override
    public String updateTask() {
        return null;
    }

    @Override
    public String deleteTask() {
        return null;
    }
}
