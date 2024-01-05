package com.example.tasktracker.core.service;

import com.example.tasktracker.core.entity.Task;
import com.example.tasktracker.core.interfaces.ITaskService;
import com.example.tasktracker.core.repository.TaskRepository;
import org.springframework.core.task.TaskRejectedException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService implements ITaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Optional<Task> create(Task task) {
        Task newTask = taskRepository.create(task);
        if (newTask != null){
            return Optional.of(newTask);
        }else {
            return Optional.empty();
        }
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Task getTask(Long id) {
        return taskRepository.getTask(id).orElseThrow(()-> new TaskRejectedException("Error Occurred"));
    }

    @Override
    public List<Task> listTask() {
        return taskRepository.listTasks();
    }

    /**
     * @param id
     * @param task
     * @return
     */
    @Override
    public Optional<Task> updateTask(Long id, Task task) {
        Task updatedTask = taskRepository.updateTask(id, task);
        if (updatedTask != null){
            return Optional.of(updatedTask);
        }else {
            return Optional.empty();
        }
    }

    @Override
    public String deleteTask() {
        return null;
    }
}
