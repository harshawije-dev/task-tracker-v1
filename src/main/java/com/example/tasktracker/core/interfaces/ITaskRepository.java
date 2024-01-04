package com.example.tasktracker.core.interfaces;

import com.example.tasktracker.core.entity.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaskRepository {
    public void create(Task task);
}
