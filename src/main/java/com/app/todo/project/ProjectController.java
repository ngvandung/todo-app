package com.app.todo.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Page<Project> getProjects(@RequestParam(name = "page", defaultValue = "0") int page,
                                     @RequestParam(name = "size", defaultValue = "10") int size) {
        return projectRepository.findAll(PageRequest.of(page, size, Sort.by("createDate").descending()));
    }

    @RequestMapping(value = "/{projectId}", method = RequestMethod.GET)
    public Project findById(@PathVariable(name = "projectId") String projectId) {
        Optional<Project> project = projectRepository.findById(projectId);
        if (project.isPresent()) {
            return project.get();
        }
        return null;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Project createProject(@RequestBody Project project) {
        return projectRepository.insert(project);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Project updateProject(@RequestBody Project project) {
        return projectRepository.save(project);
    }
}
