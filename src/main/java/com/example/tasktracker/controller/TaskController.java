package com.example.tasktracker.controller;

import com.example.tasktracker.core.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController{

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @RequestMapping("/task")
    public String get(){
        return "Hello Task";
    }

    @GetMapping("/tasks")
    private List<?> index(){
        return taskService.listTask();
    }

}
