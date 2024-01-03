package com.example.tasktracker.core.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tasktracker.core.entitiy.Task;

public interface ITaskRepository {
    public JpaRepository<Task, Long> createTask();
    public JpaRepository<Task, Long> getTask();
    public JpaRepository<Task, Long> listTask();
    public JpaRepository<Task, Long> updateTask();
    public JpaRepository<Task, Long> deleteTask();

}
