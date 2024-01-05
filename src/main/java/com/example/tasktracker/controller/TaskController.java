package com.example.tasktracker.controller;

import com.example.tasktracker.core.entity.Task;
import com.example.tasktracker.core.service.TaskService;
import org.springframework.core.task.TaskRejectedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/task-tracker")
public class TaskController{

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/task/{id}")
    public Task get(@PathVariable Long id){
        return taskService.getTask(id);
    }

    @GetMapping("/tasks")
    private List<Task> index(){
        return taskService.listTask();
    }

    @PostMapping("/task")
    private Task create(@RequestBody Task task){
        return taskService.create(task)
                .orElseThrow(()-> new TaskRejectedException("Error Occurred"));
    }

    @PutMapping("/task/{id}")
    private Task update(@RequestBody Task task, @PathVariable Long id){
        return taskService.updateTask(id, task).
                orElseThrow(()-> new TaskRejectedException("Error Occurred"));
    }

    @DeleteMapping("/task/{id}")
    private void delete(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

}
