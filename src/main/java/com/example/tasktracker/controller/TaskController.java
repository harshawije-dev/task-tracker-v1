package com.example.tasktracker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController{
    @RequestMapping("/task/")
    public String index(){
        return "Hello World";
    }

}
