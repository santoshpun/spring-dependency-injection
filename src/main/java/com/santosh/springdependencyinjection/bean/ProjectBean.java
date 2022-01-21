package com.santosh.springdependencyinjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectBean {
    @Autowired
    private ProjectService projectService;

    public void save(int id, String name) {
        projectService.saveProject(id, name);
    }
}
