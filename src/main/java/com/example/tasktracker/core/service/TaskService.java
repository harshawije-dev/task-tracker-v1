package com.example.tasktracker.core.service;

import com.example.tasktracker.core.entity.Task;
import com.example.tasktracker.core.interfaces.ITaskService;
import com.example.tasktracker.core.repository.TaskRepository;

class TaskService implements ITaskService {
    private TaskRepository taskRepository;

    TaskService(TaskRepository repository) {
        this.taskRepository = repository;
    }

    public TaskService() {}

    @Override
    public Task create(Task task) {
        return null;
    }

    @Override
    public Task getTask() {
        return null;
    }

    @Override
    public Task listTask() {
        return null;
    }

    @Override
    public Task updateTask() {
        return null;
    }

    @Override
    public Task deleteTask() {
        return null;
    }
}
