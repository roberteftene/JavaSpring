package org.dbts.service;

import org.dbts.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();

    Task findFirstById(Long id);

    Task addTask(Task task);

    Task updateTask(Long id, Task task);

    Task removeTask(Long id);

}
