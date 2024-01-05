package com.example.tasktracker.core.interfaces;

import com.example.tasktracker.core.entity.Task;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ITaskRepository {
    public Task create(Task task);
    public List<Task> listTasks();
    public Optional<?> getTask(Long id);
    public Task updateTask(Long id, Task updateTask);
    public void deleteTask(Long id);
}
