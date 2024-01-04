package com.example.tasktracker.core.interfaces;

import com.example.tasktracker.core.entity.Task;

public interface ITaskService {
    public Task create(Task task);
    public Task getTask();
    public Task listTask();
    public Task updateTask();
    public Task deleteTask();
}
