package com.example.tasktracker.repository;

import com.example.tasktracker.core.entitiy.Task;
import com.example.tasktracker.core.interfaces.ITaskRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public class TaskRepository implements ITaskRepository {

    @Override
    public JpaRepository<Task, Long> createTask() {
        return null;
    }

    @Override
    public JpaRepository<Task, Long> getTask() {
        return null;
    }

    @Override
    public JpaRepository<Task, Long> listTask() {
        return null;
    }

    @Override
    public JpaRepository<Task, Long> updateTask() {
        return null;
    }

    @Override
    public JpaRepository<Task, Long> deleteTask() {
        return null;
    }
}
