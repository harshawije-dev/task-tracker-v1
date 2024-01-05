package com.example.tasktracker.core.interfaces;

import com.example.tasktracker.core.entity.Task;

import java.util.List;

public interface ITaskService {
    public Task create(Task task);
    public Task getTask(Long id);
    public List<Task> listTask();
    public String updateTask();
    public String deleteTask();
}
