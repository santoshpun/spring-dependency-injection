package com.santosh.springdependencyinjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectFieldSetterBean {
    private ProjectService projectService;

    @Autowired
    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }

    public void save(int id, String name) {
        projectService.saveProject(id, name);
    }
}
