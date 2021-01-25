package com.app.todo.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }
}
