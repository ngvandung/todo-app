package com.app.todo.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Page<Task> getTasks(@RequestParam(name = "page", defaultValue = "0") int page,
                                     @RequestParam(name = "size", defaultValue = "10") int size) {
        return taskRepository.findAll(PageRequest.of(page, size, Sort.by("createDate").descending()));
    }

    @RequestMapping(value = "/{taskId}", method = RequestMethod.GET)
    public Task findById(@PathVariable(name = "taskId") String taskId) {
        Optional<Task> task = taskRepository.findById(taskId);
        if (task.isPresent()) {
            return task.get();
        }
        return null;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Task createProject(@RequestBody Task task) {
        return taskRepository.insert(task);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Task updateProject(@RequestBody Task task) {
        return taskRepository.save(task);
    }
}
