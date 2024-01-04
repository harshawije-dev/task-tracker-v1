package com.example.tasktracker.core.interfaces;

import com.example.tasktracker.core.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepository {
    public JpaRepository<Task, Long> createTask();
    public JpaRepository<Task, Long> getTask();
    public JpaRepository<Task, Long> listTask();
    public JpaRepository<Task, Long> updateTask();
    public JpaRepository<Task, Long> deleteTask();
}
