package com.example.tasktracker.core.interfaces;

import com.example.tasktracker.core.entitiy.Task;

public interface ITaskService {
    public Task createTask();
    public Task getTask();
    public Task updateTask();
    public Task deleteTask();
}
