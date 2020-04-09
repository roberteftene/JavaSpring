package org.dbts.service;

import org.dbts.model.Task;
import org.dbts.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("taskService")
public class SimpleTaskService implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task findFirstById(Long id) {
        Optional<Task> task = taskRepository.findById(id);
        return task.orElse(null);
    }

    @Override
    public Task addTask(Task task) {
        taskRepository.saveAndFlush(task);
        return task;
    }

    @Override
    public Task updateTask(Long id, Task task) {
        Task existingTask = taskRepository.getOne(id);
        existingTask.setName(task.getName());
        existingTask.setDescription(task.getDescription());
        return taskRepository.saveAndFlush(existingTask);
    }

    @Override
    public Task removeTask(Long id) {
        Optional<Task> existingTask = taskRepository.findById(id);
        existingTask.ifPresent(task -> taskRepository.delete(task));
        return existingTask.orElse(new Task());
    }


}
