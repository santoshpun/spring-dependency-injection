package com.santosh.springdependencyinjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectConstructorDIBean {
    private ProjectService projectService;

    @Autowired
    public ProjectConstructorDIBean(ProjectService projectService) {
        this.projectService = projectService;
    }

    public void save(int id, String name){
        this.projectService.saveProject(id,name);
    }
}
