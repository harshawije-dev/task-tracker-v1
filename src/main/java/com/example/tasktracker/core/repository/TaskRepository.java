package com.example.tasktracker.core.repository;

import com.example.tasktracker.core.interfaces.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class TaskRepository implements ITaskRepository {

    @Autowired
    private ITaskRepository iTaskRepository;
}
