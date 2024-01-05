package com.example.tasktracker.core.repository;

import com.example.tasktracker.core.entity.Task;
import com.example.tasktracker.core.interfaces.IRepository;
import com.example.tasktracker.core.interfaces.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TaskRepository implements ITaskRepository {

    @Autowired
    private IRepository repository;

    TaskRepository(IRepository repository) {
        this.repository = repository;
    }

    @Override
    public Task create(Task task) {
        return repository.save(task);
    }

    @Override
    public List<Task> listTasks() {
        return repository.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Task> getTask(Long id) {
        return repository.findById(id);
    }

    /**
     * @param id
     * @param updateTask
     * @return
     */
    @Override
    public Task updateTask(Long id, Task updateTask) {
        return repository.findById(id).map(task -> {
            task.setTitle(updateTask.getTitle());
            task.setNote(updateTask.getTitle());
            return repository.save(task);
        }).orElseGet(()-> {
            updateTask.setId(id);
            return repository.save(updateTask);
        });
    }

    /**
     * @param id
     * @return
     */
    @Override
    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}
