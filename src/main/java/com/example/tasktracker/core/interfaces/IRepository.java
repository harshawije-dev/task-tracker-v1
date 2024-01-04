package com.example.tasktracker.core.interfaces;

import com.example.tasktracker.core.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepository extends JpaRepository<Task, Long> {
}
