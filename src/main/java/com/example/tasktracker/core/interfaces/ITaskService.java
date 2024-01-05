package com.example.tasktracker.core.interfaces;

import com.example.tasktracker.core.entity.Task;

import java.util.List;
import java.util.Optional;

public interface ITaskService {
    public Optional<?> create(Task task);
    public Task getTask(Long id);
    public List<Task> listTask();
    public Optional<?> updateTask(Long id, Task task);
    public String deleteTask();
}
