package com.example.tasktracker.core.interfaces;

import com.example.tasktracker.core.entity.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITaskRepository {
    public Task create(Task task);
    public List<Task> listTasks();
    public Task getTask(String id);
    public Task updateTask(String id, Task updateTask);
    public Task deleteTask(String id);
}
