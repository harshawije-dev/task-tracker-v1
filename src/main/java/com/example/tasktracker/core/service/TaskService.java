package com.example.tasktracker.core.service;

import com.example.tasktracker.core.entity.Task;
import com.example.tasktracker.core.interfaces.ITaskService;
import com.example.tasktracker.core.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements ITaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task create(Task task) {
        Task newTask = taskRepository.create(task);
        if (newTask.isCompleted(true)){
            return newTask;
        }else{
            return null;
        }
    }

    @Override
    public Task getTask(String id) {
        return null;
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
